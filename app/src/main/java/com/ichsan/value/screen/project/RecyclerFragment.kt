package com.ichsan.value.screen.project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ichsan.value.R
import com.ichsan.value.databinding.FragmentRecycleBinding
import kotlinx.android.synthetic.main.fragment_recycle.*
import kotlinx.coroutines.Dispatchers.Main


class RecyclerFragment : Fragment() {

    private lateinit var binding: FragmentRecycleBinding

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_recycle, container, false)
        return binding.root
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        recycler_view.apply {
            val listItem = listOf(
                Item( "https://pendidikan.id/news/wp-content/uploads/2018/07/banner-news1.png",
                    "Aplikasi Khusus Pendidikan Nasional","aplikasi ini usulan dari pemerintah untuk anak bangsa dikarenakan gratis"),
                Item( "https://markey.id/wp-content/uploads/2019/07/297-membuat-aplikasi-android-berbasis-web.jpg",
                    "Aplikasi Kotlin dan Web Laravel","Aplikasi ini sudah terintegrasi sama web laravel"),
                Item( "https://mmc.tirto.id/image/2020/02/10/ilustrasi-virus-istock--2_ratio-16x9.jpg",
                    "API Data Statistik Persentase CORONA","Untuk memudahkan para programmer untuk memasang data persentase corona"),
                        Item( "https://www.goodnewsfromindonesia.id/uploads/post/large-indonesia-rumah-terbesar-bagi-burung-surga-b1f4b4891ba9d91f89c96683cd4eafed.jpg",
                "WEB Online Shop Berdikari","Online Shop dari Timur dengan menunjukan ciri khas nya"),
                Item( "https://pbs.twimg.com/profile_images/641639979060346880/3obKtBDl.jpg",
                    "WEB Pendaftaran Calon Usaha Baru","Untuk anda yang sudah milik usaha tapi tidak ada relasi atau butuh bantuan pemerintah"),
                Item( "https://1.bp.blogspot.com/-XooNxATNmLg/WZ_mcZlw06I/AAAAAAAAAho/I2ehPaqCLY4l2Eqd0Qh4J2PxJEid9f96ACLcBGAs/s1600/referensi.jpeg",
                    "Aplikasi URefensei","Aplikasi yang mengumppilkan segala referensi yang kamu inginkan"),
                Item( "https://asset-a.grid.id/crop/0x0:0x0/x/photo/2018/11/08/2426605662.jpg",
                    "WEB Online Shop Kratom","online shop yang menjual bubuk kratom yang memiliki kwalitas yang terbaik"),
                Item( "https://pbs.twimg.com/profile_images/917698980372295680/65_yNAI-_400x400.jpg ",
                    "Aplikasi Amanah Cleaning Sevice","Aplikasi untuk memesan cleaning service kerumah atau kekantor anda"),
                Item( "https://si.wsj.net/public/resources/images/OG-BA910_201712_GR_20171229145046.gif",
                    "Aplikasi Productive","Aplikasi yang membuat anda produktif dan disiplin oleh waktu"),
                Item( "https://i.kfs.io/album/global/81468909,0v1/fit/500x500.jpg",
                    "Apikasi Music Ku","aplikasi music terlengkap, dengan lirik yang akurat"),
                Item( "https://pendidikan.id/news/wp-content/uploads/2018/07/banner-news1.png",
                    "Aplikasi Khusus Pendidikan Nasional","aplikasi ini usulan dari pemerintah untuk anak bangsa dikarenakan gratis"),
                Item( "https://markey.id/wp-content/uploads/2019/07/297-membuat-aplikasi-android-berbasis-web.jpg",
                    "Aplikasi Kotlin dan Web Laravel","Aplikasi ini sudah terintegrasi sama web laravel"),
                Item( "https://mmc.tirto.id/image/2020/02/10/ilustrasi-virus-istock--2_ratio-16x9.jpg",
                    "API Data Statistik Persentase CORONA","Untuk memudahkan para programmer untuk memasang data persentase corona"),
                Item( "https://www.goodnewsfromindonesia.id/uploads/post/large-indonesia-rumah-terbesar-bagi-burung-surga-b1f4b4891ba9d91f89c96683cd4eafed.jpg",
                    "WEB Online Shop Berdikari","Online Shop dari Timur dengan menunjukan ciri khas nya"),
                Item( "https://pbs.twimg.com/profile_images/641639979060346880/3obKtBDl.jpg",
                    "WEB Pendaftaran Calon Usaha Baru","Untuk anda yang sudah milik usaha tapi tidak ada relasi atau butuh bantuan pemerintah"),
                Item( "https://1.bp.blogspot.com/-XooNxATNmLg/WZ_mcZlw06I/AAAAAAAAAho/I2ehPaqCLY4l2Eqd0Qh4J2PxJEid9f96ACLcBGAs/s1600/referensi.jpeg",
                    "Aplikasi URefensei","Aplikasi yang mengumppilkan segala referensi yang kamu inginkan"),
                Item( "https://asset-a.grid.id/crop/0x0:0x0/x/photo/2018/11/08/2426605662.jpg",
                    "WEB Online Shop Kratom","online shop yang menjual bubuk kratom yang memiliki kwalitas yang terbaik"),
                Item( "https://pbs.twimg.com/profile_images/917698980372295680/65_yNAI-_400x400.jpg ",
                    "Aplikasi Amanah Cleaning Sevice","Aplikasi untuk memesan cleaning service kerumah atau kekantor anda"),
                Item( "https://si.wsj.net/public/resources/images/OG-BA910_201712_GR_20171229145046.gif",
                    "Aplikasi Productive","Aplikasi yang membuat anda produktif dan disiplin oleh waktu"),
                Item( "https://i.kfs.io/album/global/81468909,0v1/fit/500x500.jpg",
                    "Apikasi Music Ku","aplikasi music terlengkap, dengan lirik yang akurat")
            )
            val RecyleAdapter = RecycleAdapter(listItem)

            layoutManager = LinearLayoutManager(activity)
            adapter = RecyleAdapter
        }
    }

    }
