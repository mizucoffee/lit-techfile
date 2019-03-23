class RenameTitleToContributions < ActiveRecord::Migration
  def change
    rename_column :contributions, :name, :title
  end
end
