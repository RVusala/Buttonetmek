package com.example.lemansdf.Activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lemansdf.databinding.ActivityMainBinding
import com.example.lemansdf.domain.PopularDomain
import com.example.lemansdf.Adapter.PopularAdapter


class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        val items = ArrayList<PopularDomain>()
        items.add(
            PopularDomain(
                "Şotland Pişiyi", "scottishfold", 15, 4.9, 200.0,
                """
                Sakit xasiyyətli olduğu üçün ev heyvanı kimi çox uyğundur.
                Həm tək yaşayan insanlara, həm də ailələrə uyğunlaşır.
                Oyuncaq sevən və təmkinli bir dostdur.
                """.trimIndent()
            )
        )
        items.add(
            PopularDomain(
                "Poodle", "poodle", 10, 4.5, 170.0,
                """
                Çox ağıllıdır və müxtəlif məşqləri tez öyrənir.
                Hipoalerjenik tükləri allergiyası olanlar üçün uyğundur.
                Ailə dostudur və uşaqlarla yaxşı münasibət qurur.
                Fərqli ölçü variantları müxtəlif həyat tərzlərinə uyğunlaşa bilər.
                """.trimIndent()
            )
        )
        items.add(
            PopularDomain(
                "Cockatiels", "parrot", 3, 4.0, 430.0,
                """
                Çox sosial və mehribandırlar, insanlara tez öyrəşirlər.
                Sadə səslər və melodiyalar öyrənə bilirlər, hətta bəzi hallarda danışa bilərlər.
                Saxlanması nisbətən asandır və uzun ömürlüdürlər.
                """.trimIndent()
            )
        )

        binding?.PopularView?.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding?.PopularView?.adapter =
            PopularAdapter(items)
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null // Avoid memory leaks by clearing the binding reference
    }
}
