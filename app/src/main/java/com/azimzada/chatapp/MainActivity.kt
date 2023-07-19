package com.azimzada.chatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.azimzada.chatapp.adapter.ChaatroomsAdapter
import com.azimzada.chatapp.databinding.ActivityGoogleSignInBinding
import com.azimzada.chatapp.databinding.ActivityMainBinding
import com.azimzada.chatapp.model.ChatroomsDTO

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //todo
        var testList = mutableListOf<ChatroomsDTO>(
            ChatroomsDTO(R.drawable.chartmos_bg__asvg , "Anastazja Ziemkowska"),
            ChatroomsDTO(R.drawable.chartmos_bg__asvg , "Anastazja Ziemkowska"),
            ChatroomsDTO(R.drawable.chartmos_bg__asvg , "Anastazja Ziemkowska"),
            ChatroomsDTO(R.drawable.chartmos_bg__asvg , "Anastazja Ziemkowska"),
            ChatroomsDTO(R.drawable.chartmos_bg__asvg , "Anastazja Ziemkowska"),
            ChatroomsDTO(R.drawable.chartmos_bg__asvg , "Anastazja Ziemkowska"),
        )

        binding.chatrooms.layoutManager = LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , false)
        binding.chatrooms.adapter = ChaatroomsAdapter(testList)

    }

}