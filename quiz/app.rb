require 'bundler/setup'
Bundler.require
require 'sinatra/reloader' if development?
require './models.rb'

before do
    if Result.all.length == 0 
        Result.create(score:0)
    end
end
