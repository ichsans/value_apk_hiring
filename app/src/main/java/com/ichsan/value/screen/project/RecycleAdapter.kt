package com.ichsan.value.screen.project



import ItemHolder
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ichsan.value.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_data.view.*


class RecycleAdapter(private val heroes: List<Item>) : RecyclerView.Adapter<ItemHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ItemHolder {
        return ItemHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.item_data, viewGroup, false))
    }

    override fun getItemCount(): Int = heroes.size

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bindHero(heroes[position])
    }
}
class ItemHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val tvHerotitle = view.title
    private val tvHerodesc = view.desc
    private val heroimg = view.img

    fun bindHero(item: Item) {
        tvHerotitle.text = item.title
        tvHerodesc.text = item.desc
        Picasso.get().load(item.image).into(heroimg)
    }
}
//
//    private val img = arrayOf("d116df5","36ffc75", "f5cfe78", "5b87628", "db8d14e", "9913dc4", "e120f96",
//        "466251b")
//
//    private val Title = arrayOf("Kekayaan", "Teknologi",
//        "Keluarga", "Bisnis",
//        "Keluarga", "Hutang",
//        "Teknologi", "Pidana")
//
//    private val Desc = arrayOf("pertanyaan 9",
//        "pertanyaan 11", "pertanyaan 17", "test forum",
//        "pertanyaan 12", "pertanyaan 18", "pertanyaan 20",
//        "pertanyaan 21")
//
//    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
//        val v = LayoutInflater.from(viewGroup.context)
//            .inflate(R.layout.item_data, viewGroup, false)
//        return ViewHolder(v)
//    }
//
//    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
//        Picasso.load(model.url).into(viewHolder.itemView.imgView)
//        viewHolder.itemTitle.text = Title[i]
//        viewHolder.itemDesc.text = Desc[i]
//
//    }
//
//    override fun getItemCount(): Int {
//        return img.size
//
//    }




