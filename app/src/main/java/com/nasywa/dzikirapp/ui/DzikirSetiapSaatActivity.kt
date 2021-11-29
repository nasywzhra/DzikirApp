package com.nasywa.dzikirapp.ui

    import android.os.Bundle
    import androidx.appcompat.app.AppCompatActivity
    import androidx.recyclerview.widget.LinearLayoutManager
    import androidx.recyclerview.widget.RecyclerView
    import com.nasywa.dzikirapp.R
    import com.nasywa.dzikirapp.adapter.DzikirDoaAdapter
    import com.nasywa.dzikirapp.model.DataDzikirDoa
    import com.nasywa.dzikirapp.model.DzikirDoa

    class SetiapSaatDzikirActivity : AppCompatActivity() {
        private lateinit var rvDzikir: RecyclerView

        private var listDzikir: ArrayList<DzikirDoa> = arrayListOf()

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            setContentView(R.layout.activity_dzikir_setiap_saat)
            rvDzikir = findViewById(R.id.rv_dzikir_setiap_saat)

            listDzikir.clear()
            listDzikir.addAll(DataDzikirDoa.listDzikir)

            rvDzikir.layoutManager = LinearLayoutManager(this)
            rvDzikir.adapter = DzikirDoaAdapter(listDzikir)
            rvDzikir.setHasFixedSize(true)
        }

        override fun onSupportNavigateUp(): Boolean {
            finish()
            return super.onSupportNavigateUp()
        }
    }
