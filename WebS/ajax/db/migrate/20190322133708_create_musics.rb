class CreateMusics < ActiveRecord::Migration
  def change
    create_table :musics do |t|
      t.integer :track_id
      t.integer :like, default: 0
      t.timestamps null: false
    end
  end
end
