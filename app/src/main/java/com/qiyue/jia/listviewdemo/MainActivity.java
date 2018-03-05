package com.qiyue.jia.listviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    private  String[] data = {"Apple", "Banana", "Orange", "Watermelon", "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango", "Apple", "Banana", "Orange", "Watermelon", "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango" };

    //创建一个动态数组ArrayList，泛型是fruit实体类
    private List<Fruit> fruitList = new ArrayList<>();

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        //初始化水果数据
        initFruit();
        //创建适配器实例，传入相应的参数
        FruitAdapter fruitAdapter = new FruitAdapter(this, R.layout.fruit_item, fruitList);
        mListView = (ListView) findViewById(R.id.list_view);
        mListView.setAdapter(fruitAdapter);
    }

    /**
     * 初始化水果数据
     */
    private void initFruit() {
        for (int i = 0; i < 4; i++){
            Fruit Apple = new Fruit("Apple",R.drawable.apple_pic);
            fruitList.add(Apple);
            Fruit Banana = new Fruit("Banana",R.drawable.banana_pic);
            fruitList.add(Banana);
            Fruit Orange = new Fruit("Orange",R.drawable.orange_pic);
            fruitList.add(Orange);
            Fruit Watermelon = new Fruit("Watermelon",R.drawable.watermelon_pic);
            fruitList.add(Watermelon);
            Fruit Pear = new Fruit("Pear",R.drawable.pear_pic);
            fruitList.add(Pear);
            Fruit Grape = new Fruit("Grape",R.drawable.grape_pic);
            fruitList.add(Grape);
            Fruit Pineapple = new Fruit("Pineapple",R.drawable.pineapple_pic);
            fruitList.add(Pineapple);
            Fruit Strawberry = new Fruit("Strawberry",R.drawable.strawberry_pic);
            fruitList.add(Strawberry);
            Fruit Cherry = new Fruit("Cherry",R.drawable.cherry_pic);
            fruitList.add(Cherry);
            Fruit Mango = new Fruit("Mango",R.drawable.mango_pic);
            fruitList.add(Mango);

        }
    }
}
