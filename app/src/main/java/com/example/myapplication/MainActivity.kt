package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        choose_button.setOnClickListener {
            val mAlertDialog = AlertDialog.Builder(this@MainActivity)
            mAlertDialog.setIcon(R.mipmap.ic_launcher_round) //set alertdialog icon
            mAlertDialog.setTitle("Title!") //set alertdialog title
            mAlertDialog.setMessage("Your message here") //set alertdialog message
            mAlertDialog.setPositiveButton("Yes") { dialog, id ->
                //perform some tasks here
                Toast.makeText(this@MainActivity, "Yes", Toast.LENGTH_SHORT).show()
            }
            mAlertDialog.setNegativeButton("No") { dialog, id ->
                //perform som tasks here
                Toast.makeText(this@MainActivity, "No", Toast.LENGTH_SHORT).show()
            }
            mAlertDialog.show()

            val newStory = Story()



            val newStorySegment = StorySegment()



            val newDecisionTrees = DecisionTree()

            fun addNewStory (newDecisionTree: DecisionTree)  {

                newStory.addDecisionTree(newDecisionTree)

            }

        }
    }

}
