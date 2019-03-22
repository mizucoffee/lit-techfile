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
    title: params[:title],
    body: params[:body],
    linkTitle: params[:linkTitle],
    url: params[:url]
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
    title: params[:title],
    body: params[:body],
    linkTitle: params[:linkTitle],
    url: params[:url]
  })
  redirect '/'
end