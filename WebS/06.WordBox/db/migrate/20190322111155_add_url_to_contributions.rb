class AddUrlToContributions < ActiveRecord::Migration
  def change
    add_column :contributions, :url, :string
    add_column :contributions, :linkTitle, :string
    rename_column :contributions, :name, :title
  end
end
