package com.example.android_registration

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import com.example.android_registration.databinding.ActivityMainBinding

lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener { CheckInfo() }

    }

    fun CheckInfo() {


        val name = binding.textView.text
        val email = binding.editTextTextEmailAddress.text
        val date = binding.date1.text


        val pass = binding.editTextTextPassword.text.toString()
        val pass2 = binding.editTextTextPassword2.text.toString()


        var gender = when (binding.gender.checkedRadioButtonId){
            R.id.male -> "male"
            R.id.female ->"female"

            else ->""
        }
        var information = if ((name.isNotBlank() && email.isNotEmpty() && date.isNotEmpty() ) && (pass == pass2)) {
            binding.finalResult.text = ("$name \n $email \n $date \n$gender")
            return
        } else {
            println("ERROR!!!\nPlease enter all the information")
            binding.finalResult.text = ("ERROR!!\nPLEASE ENTER ALL INFORMATION CORRECTLY!")
            return
        }
//{//fun returnpass(var password:String) {
//    val password = if (pass != pass2) {
//        println("password not matched")
//    } else {
//        println("password match")
//    }
//    return password
//}


        binding.finalResult.text = information.toString()

        //
//        binding.finalResult.text = getString(R.string.name_info, name)
//        binding.finalResult.text = getString(R.string.email_info, Email)

    }


}