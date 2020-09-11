
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ichsan.value.screen.project.Item
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_data.view.*


class ItemHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val tvHerotitle = view.title
    private val tvHerodesc = view.desc
    private val heroimg = view.img

    fun bindHero(hero: Item) {
        tvHerotitle.text = hero.title
        tvHerodesc.text = hero.desc
        Picasso.get().load(hero.image).into(heroimg)
    }
}
//        itemView.setOnClickListener {
//            var position: Int = getAdapterPosition()
//            val context = itemView.context
//            val intent = Intent(context, MainActivity::class.java).apply {
//                putExtra("NUMBER", position)
//                putExtra("CODE", itemImg.text)
//                putExtra("CATEGORY", itemTitle.text)
//                putExtra("CONTENT", itemDesc.text)
//            }
//



