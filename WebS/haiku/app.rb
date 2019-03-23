require 'bundler/setup'
Bundler.require
require 'sinatra/reloader' if development?
require 'open-uri'
require 'sinatra/json'
require './models/contribution.rb'

get '/' do
  @contents = Contribution.order('id desc').all
  erb :index
end

post '/new' do
  Contribution.create({
    haiku1: params[:haiku1],
    haiku2: params[:haiku2],
    haiku3: params[:haiku3],
    haiku4: params[:haiku4],
    haiku5: params[:haiku5],
    author: params[:author]
  })

  redirect '/'
end

post '/delete/:id' do
  Contribution.find(params[:id]).destroy
  redirect '/'
end

post '/edit/:id' do
  @content = Contribution.find(params[:id])
  erb :edit
end

post '/renew/:id' do
  content = Contribution.find(params[:id])
  content.update({
    haiku1: params[:haiku1],
    haiku2: params[:haiku2],
    haiku3: params[:haiku3],
    haiku4: params[:haiku4],
    haiku5: params[:haiku5],
    author: params[:author]
  })
  redirect '/'
end