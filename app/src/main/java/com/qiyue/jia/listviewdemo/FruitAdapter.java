package com.qiyue.jia.listviewdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jia on 2018/3/5.
 */

public class FruitAdapter extends ArrayAdapter<Fruit> {

    private int resourceId;
    private ImageView mFruitImage;
    private TextView mFruitText;

    /**
     * 重写了父类的一组构造函数，
     * @param context 上下文
     * @param resource 子布局的id
     * @param objects 数据
     */
    public FruitAdapter(@NonNull Context context, int resource, @NonNull List<Fruit> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //获取当前的Fruit实例
        Fruit fruit = getItem(position);
        //调用LayoutInflater中的inflate加载子条目布局
        //第三个参数指定为false，表名只让我们在父布局中声明的layout属性生效，
        //但不会这个view添加父布局，因为view一旦有了父布局之后，就不能添加到listview中了
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);

        mFruitImage = view.findViewById(R.id.im_fruit_image);
        mFruitText = view.findViewById(R.id.tv_fruit_name);
        mFruitImage.setImageResource(fruit.getImageId());
        mFruitText.setText(fruit.getName());

        return view;
    }
}
