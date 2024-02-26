package com.example.snackmate

import android.app.Activity
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import android.graphics.drawable.BitmapDrawable
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.snackmate.ui.theme.SnackMateTheme

class MainActivity : ComponentActivity() {
    private lateinit var OutletimageButton: ImageButton
    private lateinit var OutletimageView : ImageView
   // private lateinit var StudentimageButton:ImageButton
 //   private lateinit var StudentimageView:ImageView
    private var selectedLayout:Int=1

    companion object {
        private const val PICK_IMAGE_REQUEST = 1
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)


//        OutletimageButton = findViewById(R.id.photoeditoutletregister)
//        OutletimageView=findViewById(R.id.photooutletregister)
//        StudentimageButton=findViewById(R.id.photostudentregister)
//        StudentimageView=findViewById(R.id.studentphotoedit)

        // Set OnClickListener to select image
//        OutletimageButton.setOnClickListener {
//            selectedLayout=1
//            openGallery()
//        }
//        //StudentimageButton.setOnClickListener {
//            selectedLayout=2
//            openGallery()
//        }

        // Set status bar color
//        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            window.statusBarColor = Color.TRANSPARENT
//            window.navigationBarColor = Color.TRANSPARENT // Make navigation bar transparent
//        }

//        // Draw gradient background behind status bar and navigation bar
//        val decorView = window.decorView
//        decorView.background = resources.getDrawable(R.drawable.logingradient)
//        // Adjust status bar icon color based on background brightness
    }

//    private fun openGallery() {
//        // Intent to pick image from gallery
//        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
////        startActivityForResult(intent, PICK_IMAGE_REQUEST)
//    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//
//        if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK && data != null) {
//            // Get the image URI from the data
//            val imageUri = data.data
//            // Set the image URI to the ImageView
//            when(selectedLayout){
//                1->OutletimageView.setImageURI(imageUri)
//                //2->StudentimageView.setImageURI(imageUri)
//            }
//
//        }
//    }



}