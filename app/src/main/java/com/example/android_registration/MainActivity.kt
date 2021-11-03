package com.example.android_registration

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import android.os.Bundle
import android.widget.DatePicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.android_registration.databinding.ActivityMainBinding
import java.util.*

lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity(){

//    var day = 0
//    var month = 0
//    var year = 0
//
//    var savedday = 0
//    var savedmonth = 0
//    var savedyear = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//
//        pickDate()
        binding.button.setOnClickListener { CheckInfo() }



//    }
//    private fun getDateTimeCalender(){
//        val cal=Calendar.getInstance()
//        day = cal.get(Calendar.DAY_OF_MONTH)
//        month = cal.get(Calendar.MONTH)
//        year = cal.get(Calendar.YEAR)
//    }
//private fun pickDate(){
//
////    btn_timePicker.setOnClickListner {
////        getDateTimeCalender()
//
//        DatePickerDialog(this,this,year,month,day).show()
//    }
//}
//
//    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
//
//
////        savedday = dayOfMonth
////        dayOfMonth = month
////        savedday = year
////
////        tv_

    }
    private fun CheckInfo() {


        val name = binding.textViewEditText.text
        val email = binding.textViewEditText1.text
        val date = binding.date1Editdate.text
        val pass = binding.editTextTextPasswordEditText.text.toString()
        val pass2 = binding.editTextTextPassword2EditText.text.toString()
        val password = pass == pass2
        val gender = when (binding.gender.checkedRadioButtonId) {
            R.id.male -> "male"
            R.id.female -> "female"

            else -> ""
        }
        var information =
            if (name!!.isNotEmpty() && (email!!.contains("@") && email.contains(".com")) && date!!.isNotEmpty() && pass.isNotEmpty() && pass2.isNotEmpty()) {
                "$name \n $email \n $date \n$gender"

            } else if (!password) {
                "ERROR!!!\nPlease enter password "


            } else {

                "ERROR!!!\nPlease enter all the information"


            }

//{//fun returnpass(var password:String) {
//    val password = if (pass != pass2) {
//        println("password not matched")
//    } else {
//        println("password match")
//    }
//    return password
//}


        binding.finalResult.text = information

        //
//        binding.finalResult.text = getString(R.string.name_info, name)
//        binding.finalResult.text = getString(R.string.email_info, Email)

    }


}