package examplewtest.midopc.test5somat.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import de.hdodenhof.circleimageview.CircleImageView;
import examplewtest.midopc.test5somat.API.Model.Shop;
import examplewtest.midopc.test5somat.R;
import examplewtest.midopc.test5somat.Target;


/**
 * Created by Mido PC on 4/20/2016.
 */
public class MainListADB extends RecyclerView.Adapter<MainListADB.VH> {

    private List<Shop>shops;
    private Context context;

    public MainListADB(List<Shop> shops, Context context) {
        this.shops = shops;
        this.context = context;
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(VH holder, final int position) {

        holder.name.setText(shops.get(position).getName());
        holder.address.setText(shops.get(position).getAddress());
        holder.fb.setText(shops.get(position).getFacebook());
        holder.phone.setText(shops.get(position).getPhone());
        holder.logo.setBorderColor(context.getResources().getColor(R.color.colorAccent));
        holder.logo.setBorderWidth(2);
        holder.logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, Target.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK).putExtra("id",shops.get(position).getId().toString()));
            }
        });



    }

    @Override
    public int getItemCount() {
        return shops.size();
    }

    public static class VH extends RecyclerView.ViewHolder{

        private CircleImageView logo;
        private TextView name,fb,address,phone;

        public VH(View itemView) {
            super(itemView);

            logo=(CircleImageView)itemView.findViewById(R.id.logo);
            name=(TextView)itemView.findViewById(R.id.nametxt);
            fb=(TextView)itemView.findViewById(R.id.fbtxt);
            address=(TextView)itemView.findViewById(R.id.addresstxt);
            phone=(TextView)itemView.findViewById(R.id.phonetxt);
        }
    }
}
