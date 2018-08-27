package com.example.wwf.karthik.materialdesign;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductAdpater extends RecyclerView.Adapter<ProductAdpater.MyViewHolder>{
   // private String[] mDataset ={"Procust 1","Product 3","Prodcut 4","Product 5"};
    private int[] mDataset ;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView tv1,tv2;
        private ImageView imageView;

        public MyViewHolder(View v) {
            super(v);
            tv1 = v.findViewById(R.id.tv1);
            tv2 = v.findViewById(R.id.tv2);
            imageView = v. findViewById(R.id.image);
        }


    }


    public ProductAdpater() {
        this.mDataset = species;
    }

    @NonNull
    @Override
    public ProductAdpater.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v =  LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.product_card_layout, viewGroup, false);

        MyViewHolder vh = new MyViewHolder(v);
        return vh;

    }




    @Override public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.imageView.setImageResource(species[i]);
        myViewHolder.tv1.setText("Animal");
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }


    private int[] species ={
            R.drawable.african_elephant,
            R.drawable.african_dog,
            R.drawable.dart_frog,
            R.drawable.hi_51806hero,
            R.drawable.img_saolo,
            R.drawable.jaguar,
            R.drawable.leopard,
            R.drawable.macaw,
            R.drawable.montain_gorilla,
            R.drawable.orant,
            R.drawable.panda,
            R.drawable.rhino,
            R.drawable.scr_47384,R.drawable.amur_heilong,
            R.drawable.bengal_tiger,R.drawable.asain_elephant,
            R.drawable.bornean_orangutan,R.drawable.black_spider
           ,R.drawable.tree_kangaro,
            R.drawable.ma_8993,R.drawable.orant,
            R.drawable.brown_bear

    };
}
