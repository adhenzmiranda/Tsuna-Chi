package com.example.assessment1nanapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.WindowManager
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.PopupWindow
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        ImageView Personal
        val bloodTypeImagePers = findViewById<ImageView>(R.id.imageViewBloodTypePers)
        bloodTypeImagePers.setVisibility(View.GONE)
//        ImageView Partner
        val bloodTypeImagePart = findViewById<ImageView>(R.id.imageViewBloodTypePart)
        bloodTypeImagePart.setVisibility(View.GONE)
//        TextViews
        val bondPartText = findViewById<TextView>(R.id.bondPartText)
        val bondPersText = findViewById<TextView>(R.id.bondPersText)

        //Popup Button
        val infobtn = findViewById<ImageButton>(R.id.openPopupinfo)
        infobtn.setOnClickListener{
            Toast.makeText(this, "Button is working", Toast.LENGTH_SHORT).show()

            val inflater = layoutInflater
            val view = inflater.inflate(R.layout.activity_popup, null)

            val window = PopupWindow(view, WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT, true)

            window.showAtLocation(view, Gravity.CENTER, 0 ,0)
        }

        //      Compatibility Button
        val checkCompBtn = findViewById<ImageButton>(R.id.checkComp)

        //        Radio Groups
        val rgPersBT = findViewById<RadioGroup>(R.id.rgbtPERS)
        val rgPartBT = findViewById<RadioGroup>(R.id.rgbtPART)

        val articleHeader1 = findViewById<TextView>(R.id.HeaderText1)
        val articleText1 = findViewById<TextView>(R.id.ArticleText1)

        val articleHeader2 = findViewById<TextView>(R.id.HeaderText2)
        val articleText2 = findViewById<TextView>(R.id.ArticleText2)

        //        Positive Traits
        val PosTraitsImagePers = findViewById<ImageView>(R.id.PositiveTraitsImgPers)
        PosTraitsImagePers.setVisibility(View.GONE)
        val PosTraitsImagePart = findViewById<ImageView>(R.id.PositiveTraitsImgPart)
        PosTraitsImagePart.setVisibility(View.GONE)
        val PosTraitsTextPers = findViewById<TextView>(R.id.TraitsTextPosPers)
        val PosTraitsTextPart = findViewById<TextView>(R.id.TraitsTextPosPart)


        //        Negative Traits
        val NegTraitsImagePers = findViewById<ImageView>(R.id.NegativeTraitsImgPers)
        NegTraitsImagePers.setVisibility(View.GONE)
        val NegTraitsImagePart = findViewById<ImageView>(R.id.NegativeTraitsImgPart)
        NegTraitsImagePart.setVisibility(View.GONE)
        val NegTraitsTextPers = findViewById<TextView>(R.id.TraitsTextNegPers)
        val NegTraitsTextPart = findViewById<TextView>(R.id.TraitsTextNegPart)


        checkCompBtn.setOnClickListener {
            //      Radio Button (Left)
            val rgPersChecked = rgPersBT.checkedRadioButtonId
            if (rgPersChecked != -1) {
                val persBT = findViewById<RadioButton>(rgPersChecked)
                val personalBloodType = persBT.text.toString()
                val bloodStringPers = "You're\n" + personalBloodType
                Toast.makeText(this, bloodStringPers, Toast.LENGTH_LONG).show()

                when (rgPersBT.indexOfChild(persBT)) {
                    0 -> {
                        // Type A
                        //Interactive bond text
                        bloodTypeImagePers.setVisibility(View.VISIBLE)
                        bloodTypeImagePers.setImageResource(R.drawable.blood_a)

                        val intertextPersO = bondPersText
                        val bloodTypeOString = "A"
                        intertextPersO.text = bloodTypeOString

//                        Article Text
                        val persHeaderBT1String = "What being an A type says\n" +
                                "about you"
                        articleHeader1.text = persHeaderBT1String
                        val persArticleBT1String = "People with blood type A are known for being conscientious, organized, loyal, and dependable. They strive for harmony but can also be overthinkers who are indecisive and have perfectionist tendencies. TypeAs tend to be people-pleasers who have difficulty expressing their own emotions. While detail-oriented team players, they may put others' needs before their own."
                        articleText1.text = persArticleBT1String

//                       Traits
                        val PosTraitsStringPers = PosTraitsTextPers
                        val PosTraits = "Conscientious\n" +
                                "Organized\n" +
                                "Loyal\n" +
                                "Dependable\n" +
                                "Cultivate solidarity"
                        PosTraitsStringPers.text = PosTraits
                        PosTraitsImagePers.setVisibility(View.VISIBLE)

                        val NegTraitsString = NegTraitsTextPers
                        val NegTraitsPers = "Overthinkers\n" +
                                "Indecisive\n" +
                                "People-pleasers\n" +
                                "Perfectionist\n" +
                                "Difficulty expressing emotions"
                        NegTraitsString.text = NegTraitsPers
                        NegTraitsImagePers.setVisibility(View.VISIBLE)
                    }
                    1 -> {
                        // Type AB
//                      Interactive bond text
                        bloodTypeImagePers.setVisibility(View.VISIBLE)
                        bloodTypeImagePers.setImageResource(R.drawable.blood_ab)

                        val intertextPersO = bondPersText
                        val bloodTypeOString = "AB"
                        intertextPersO.text = bloodTypeOString
//                      Article Text
                        val persHeaderBT1String = "What being an AB type says\n" +
                                "about you"
                        articleHeader1.text = persHeaderBT1String
                        val persArticleBT1String = "Those with blood type AB are considered a unique mix of the rational precision of Type As and the creative free-spiritedness of Type Bs. They are adaptable, diplomatic rational thinkers who can be analytical yet open-minded. However, ABs can also come across as aloof, indecisive, emotionally detached, secretive, and avoidant of conflict. They seek intellectual and emotional connections but can struggle with neediness. Overall, ABs are complex personalities who value space and independence."
                        articleText1.text = persArticleBT1String

//                       Traits
                        val PosTraitsStringPers = PosTraitsTextPers
                        val PosTraits = "Rational\n" +
                                "Adaptable\n" +
                                "Diplomatic\n" +
                                "Analytical\n" +
                                "Open-minded"
                        PosTraitsStringPers.text = PosTraits
                        PosTraitsImagePers.setVisibility(View.VISIBLE)

                        val NegTraitsString = NegTraitsTextPers
                        val NegTraitsPers = "Aloof\n" +
                                "Indecisive\n" +
                                "Detached\n" +
                                "Secretive\n" +
                                "Unconfrontational"
                        NegTraitsString.text = NegTraitsPers
                        NegTraitsImagePers.setVisibility(View.VISIBLE)
                    }
                    2 -> {
                        // Type B
                        // ... (existing code for Type B)
                        bloodTypeImagePers.setVisibility(View.VISIBLE)
                        bloodTypeImagePers.setImageResource(R.drawable.blood_b)

                        val intertextPersO = bondPersText
                        val bloodTypeOString = "B"
                        intertextPersO.text = bloodTypeOString

                        val persHeaderBT1String = "What being a B type says\n" +
                                "about you"
                        articleHeader1.text = persHeaderBT1String
                        val persArticleBT1String = "People with blood type B are described as easygoing, creative independents who are honest and optimistic. On the negative side, they can be self-centered, impulsive, insensitive, struggle with rules, and be unreliable at times. Type Bs crave freedom and get bored easily, but are also passionate go-getters. In relationships, they need space and shared interests over clinginess."
                        articleText1.text = persArticleBT1String

//                       Traits
                        val PosTraitsStringPers = PosTraitsTextPers
                        val PosTraits = "Easygoing\n" +
                                "Independent\n" +
                                "Creative\n" +
                                "Optimistic\n" +
                                "Honest"
                        PosTraitsStringPers.text = PosTraits
                        PosTraitsImagePers.setVisibility(View.VISIBLE)

                        val NegTraitsString = NegTraitsTextPers
                        val NegTraitsPers = "Self-centered\n" +
                                "Impulsive\n" +
                                "Insensitive\n" +
                                "Defiant\n" +
                                "Flaky"
                        NegTraitsString.text = NegTraitsPers
                        NegTraitsImagePers.setVisibility(View.VISIBLE)
                    }
                    3 -> {
                        // Type O
                        // ... (existing code for Type O)
                        bloodTypeImagePers.setVisibility(View.VISIBLE)
                        bloodTypeImagePers.setImageResource(R.drawable.blood_o)

                        val intertextPersO = bondPersText
                        val bloodTypeOString = "O"
                        intertextPersO.text = bloodTypeOString

                        //                      Article text
                        val persHeaderBT1String = "What being an O type says\n" +
                                "about you"
                        articleHeader1.text = persHeaderBT1String
                        val persArticleBT1String = "Individuals with Type O blood are often viewed as natural leaders. They are characterized by their self-confidence, ambition, and resilience. Outgoing and sociable, they enjoy being at the center of attention and are often seen as inspiring figures. Type Os are generally optimistic, viewing challenges as opportunities for growth. However, their strong-willed nature can sometimes be perceived as arrogance or stubbornness. They value honesty and direct communication but may struggle with details and organization. In relationships, they are generous and protective, often putting the needs of others before their own."
                        articleText1.text = persArticleBT1String

//                       Traits
                        val PosTraitsStringPers = PosTraitsTextPers
                        val PosTraits = "Confident\n" +
                                "Natural leaders\n" +
                                "Decisive\n" +
                                "Adventurous\n" +
                                "Charismatic\n"
                        PosTraitsStringPers.text = PosTraits
                        PosTraitsImagePers.setVisibility(View.VISIBLE)

                        val NegTraitsString = NegTraitsTextPers
                        val NegTraitsPers = "Arrogant\n" +
                                "Insensitive\n" +
                                "Impatient\n" +
                                "Reckless\n" +
                                "Dominating"
                        NegTraitsString.text = NegTraitsPers
                        NegTraitsImagePers.setVisibility(View.VISIBLE)
                    }
                }
            } else {
                Toast.makeText(this, "Please select YOUR blood type", Toast.LENGTH_LONG).show()
            }

            //      Radio Button (Right)
            val rgPartChecked = rgPartBT.checkedRadioButtonId
            if (rgPartChecked != -1) {
                val persBT = findViewById<RadioButton>(rgPersChecked)
                val partBT = findViewById<RadioButton>(rgPartChecked)
                val partnerBloodType = partBT.text.toString()
                val bloodStringPart = "Partner is\n" + partnerBloodType
                Toast.makeText(this, bloodStringPart, Toast.LENGTH_LONG).show()

                val persIndex = rgPersBT.indexOfChild(persBT)
                val partIndex = rgPartBT.indexOfChild(partBT)

                if (persIndex != -1 && persIndex == partIndex) {
                    // Display only the personal blood type content
                    when (rgPersBT.indexOfChild(persBT)) {
                        0 -> {
                            // Type A
                            //Interactive bond text
                            bloodTypeImagePart.setVisibility(View.GONE)
                            bloodTypeImagePart.setImageResource(R.drawable.blood_a)

                            val intertextPartO = bondPartText
                            val bloodTypeOString = "A"
                            intertextPartO.text = bloodTypeOString

                            //                      Article text
                            val partHeaderString = ""
                            articleHeader2.text = partHeaderString
                            articleHeader2.setVisibility(View.GONE)
                            val partTextString = ""
                            articleText2.text = partTextString
                            articleText2.setVisibility(View.GONE)
                            val persHeaderBT1String = "What being an A type says\n" +
                                    "about you"
                            articleHeader1.text = persHeaderBT1String
                            val persArticleBT1String = "People with blood type A are known for being conscientious, organized, loyal, and dependable. They strive for harmony but can also be overthinkers who are indecisive and have perfectionist tendencies. TypeAs tend to be people-pleasers who have difficulty expressing their own emotions. While detail-oriented team players, they may put others' needs before their own."
                            articleText1.text = persArticleBT1String

//                       Traits
                            val PosTraitsStringPers = PosTraitsTextPers
                            val PosTraitsStringPart = PosTraitsTextPart
                            val PosTraitsPart = ""
                            val PosTraits = "Conscientious\n" +
                                    "Organized\n" +
                                    "Loyal\n" +
                                    "Dependable\n" +
                                    "Cultivate solidarity"
                            PosTraitsStringPers.text = PosTraits
                            PosTraitsStringPart.text = PosTraitsPart
                            PosTraitsImagePart.setVisibility(View.GONE)

                            val NegTraitsString = NegTraitsTextPers
                            val NegTraitsStringPart = NegTraitsTextPart
                            val NegTraitsPart = ""
                            val NegTraitsPers = "Overthinkers\n" +
                                    "Indecisive\n" +
                                    "People-pleasers\n" +
                                    "Perfectionist\n" +
                                    "Difficulty expressing emotions"
                            NegTraitsString.text = NegTraitsPers
                            NegTraitsStringPart.text = NegTraitsPart
                            NegTraitsImagePart.setVisibility(View.GONE)
                        }
                        1 -> {
                            // Type AB
//                      Interactive bond text
                            bloodTypeImagePart.setVisibility(View.GONE)
                            bloodTypeImagePart.setImageResource(R.drawable.blood_ab)

                            val intertextPartO = bondPartText
                            val bloodTypeOString = "AB"
                            intertextPartO.text = bloodTypeOString

                            //                      Article text
                            val partHeaderString = ""
                            articleHeader2.text = partHeaderString
                            articleHeader2.setVisibility(View.GONE)
                            val partTextString = ""
                            articleText2.text = partTextString
                            articleText2.setVisibility(View.GONE)
                            val persHeaderBT1String = "What being an AB type says\n" +
                                    "about you"
                            articleHeader1.text = persHeaderBT1String
                            val persArticleBT1String = "Those with blood type AB are considered a unique mix of the rational precision of Type As and the creative free-spiritedness of Type Bs. They are adaptable, diplomatic rational thinkers who can be analytical yet open-minded. However, ABs can also come across as aloof, indecisive, emotionally detached, secretive, and avoidant of conflict. They seek intellectual and emotional connections but can struggle with neediness. Overall, ABs are complex personalities who value space and independence."
                            articleText1.text = persArticleBT1String

//                       Traits
                            val PosTraitsStringPers = PosTraitsTextPers
                            val PosTraitsStringPart = PosTraitsTextPart
                            val PosTraitsPart = ""
                            val PosTraits = "Rational\n" +
                                    "Adaptable\n" +
                                    "Diplomatic\n" +
                                    "Analytical\n" +
                                    "Open-minded"
                            PosTraitsStringPers.text = PosTraits
                            PosTraitsStringPart.text = PosTraitsPart
                            PosTraitsImagePart.setVisibility(View.GONE)

                            val NegTraitsString = NegTraitsTextPers
                            val NegTraitsStringPart = NegTraitsTextPart
                            val NegTraitsPart = ""
                            val NegTraitsPers = "Aloof\n" +
                                    "Indecisive\n" +
                                    "Detached\n" +
                                    "Secretive\n" +
                                    "Unconfrontational"
                            NegTraitsString.text = NegTraitsPers
                            NegTraitsStringPart.text = NegTraitsPart
                            NegTraitsImagePart.setVisibility(View.GONE)
                        }
                        2 -> {
                            // Type B
                            // ... (existing code for Type B)
                            bloodTypeImagePart.setVisibility(View.GONE)
                            bloodTypeImagePart.setImageResource(R.drawable.blood_b)

                            val intertextPartO = bondPartText
                            val bloodTypeOString = "B"
                            intertextPartO.text = bloodTypeOString

                            //                      Article text
                            val partHeaderString = ""
                            articleHeader2.text = partHeaderString
                            articleHeader2.setVisibility(View.GONE)
                            val partTextString = ""
                            articleText2.text = partTextString
                            articleText2.setVisibility(View.GONE)
                            val persHeaderBT1String = "What being a B type says\n" +
                                    "about you"
                            articleHeader1.text = persHeaderBT1String
                            val persArticleBT1String = "People with blood type B are described as easygoing, creative independents who are honest and optimistic. On the negative side, they can be self-centered, impulsive, insensitive, struggle with rules, and be unreliable at times. Type Bs crave freedom and get bored easily, but are also passionate go-getters. In relationships, they need space and shared interests over clinginess."
                            articleText1.text = persArticleBT1String

//                       Traits
                            val PosTraitsStringPers = PosTraitsTextPers
                            val PosTraitsStringPart = PosTraitsTextPart
                            val PosTraitsPart = ""
                            val PosTraits = "Easygoing\n" +
                                    "Independent\n" +
                                    "Creative\n" +
                                    "Optimistic\n" +
                                    "Honest"
                            PosTraitsStringPers.text = PosTraits
                            PosTraitsStringPart.text = PosTraitsPart
                            PosTraitsImagePart.setVisibility(View.GONE)

                            val NegTraitsString = NegTraitsTextPers
                            val NegTraitsStringPart = NegTraitsTextPart
                            val NegTraitsPart = ""
                            val NegTraitsPers = "Self-centered\n" +
                                    "Impulsive\n" +
                                    "Insensitive\n" +
                                    "Defiant\n" +
                                    "Flaky"
                            NegTraitsString.text = NegTraitsPers
                            NegTraitsStringPart.text = NegTraitsPart
                            NegTraitsImagePart.setVisibility(View.GONE)
                        }
                        3 -> {
                            // Type O
                            // ... (existing code for Type O)
                            bloodTypeImagePart.setVisibility(View.GONE)
                            bloodTypeImagePart.setImageResource(R.drawable.blood_o)

                            val intertextPartO = bondPartText
                            val bloodTypeOString = "O"
                            intertextPartO.text = bloodTypeOString

                            //                      Article text
                            val partHeaderString = ""
                            articleHeader2.text = partHeaderString
                            articleHeader2.setVisibility(View.GONE)
                            val partTextString = ""
                            articleText2.text = partTextString
                            articleText2.setVisibility(View.GONE)
                            val persHeaderBT1String = "What being an O type says\n" +
                                    "about you"
                            articleHeader1.text = persHeaderBT1String
                            val persArticleBT1String = "Individuals with Type O blood are often viewed as natural leaders. They are characterized by their self-confidence, ambition, and resilience. Outgoing and sociable, they enjoy being at the center of attention and are often seen as inspiring figures. Type Os are generally optimistic, viewing challenges as opportunities for growth. However, their strong-willed nature can sometimes be perceived as arrogance or stubbornness. They value honesty and direct communication but may struggle with details and organization. In relationships, they are generous and protective, often putting the needs of others before their own."
                            articleText1.text = persArticleBT1String

//                       Traits
                            val PosTraitsStringPers = PosTraitsTextPers
                            val PosTraitsStringPart = PosTraitsTextPart
                            val PosTraitsPart = ""
                            val PosTraits = "\n" +
                                    "Confident\n" +
                                    "Natural leaders\n" +
                                    "Decisive\n" +
                                    "Adventurous\n" +
                                    "Charismatic\n"
                            PosTraitsStringPers.text = PosTraits
                            PosTraitsStringPart.text = PosTraitsPart
                            PosTraitsImagePart.setVisibility(View.GONE)

                            val NegTraitsString = NegTraitsTextPers
                            val NegTraitsStringPart = NegTraitsTextPart
                            val NegTraitsPart = ""
                            val NegTraitsPers = "\n" +
                                    "Arrogant\n" +
                                    "Insensitive\n" +
                                    "Impatient\n" +
                                    "Reckless\n" +
                                    "Dominating"
                            NegTraitsString.text = NegTraitsPers
                            NegTraitsStringPart.text = NegTraitsPart
                            NegTraitsImagePart.setVisibility(View.GONE)
                        }
                    }
                } else {
                    when (rgPartBT.indexOfChild(partBT)) {
                        0 -> {
//                        Type A
                            bloodTypeImagePart.setVisibility(View.VISIBLE)
                            bloodTypeImagePart.setImageResource(R.drawable.blood_a)

                            val intertextPartO = bondPartText
                            val bloodTypeOString = "A"
                            intertextPartO.text = bloodTypeOString
                            articleText2.setVisibility(View.VISIBLE)
//                       Article text
                            val partHeaderBT2String = "What being an A type says\n" +
                                    "about you"
                            articleHeader2.text = partHeaderBT2String
                            articleHeader2.setVisibility(View.VISIBLE)
                            val partArticleBT2String = "\n" +
                                    "People with blood type A are known for being conscientious, organized, loyal, and dependable. They strive for harmony but can also be overthinkers who are indecisive and have perfectionist tendencies. Type As tend to be people-pleasers who have difficulty expressing their own emotions. While detail-oriented team players, they may put others' needs before their own."
                            articleText2.text = partArticleBT2String
                            articleText2.setVisibility(View.VISIBLE)

//                      Traits
                            val PosTraitsStringPart = PosTraitsTextPart
                            val PosTraits = "Conscientious\n" +
                                    "Organized\n" +
                                    "Loyal\n" +
                                    "Dependable\n" +
                                    "Cultivate solidarity"
                            PosTraitsStringPart.text = PosTraits
                            PosTraitsImagePart.setVisibility(View.VISIBLE)

                            val NegTraitsString = NegTraitsTextPart
                            val NegTraitsPart = "Overthinkers\n" +
                                    "Indecisive\n" +
                                    "People-pleasers\n" +
                                    "Perfectionist\n" +
                                    "Difficulty expressing emotions"
                            NegTraitsString.text = NegTraitsPart
                            NegTraitsImagePart.setVisibility(View.VISIBLE)

                        }
                        1 -> {
                            // Type AB
                            bloodTypeImagePart.setVisibility(View.VISIBLE)
                            bloodTypeImagePart.setImageResource(R.drawable.blood_ab)

                            val intertextPartO = bondPartText
                            val bloodTypeOString = "AB"
                            intertextPartO.text = bloodTypeOString

                            //                       Article text
                            val partHeaderBT2String = "What being an AB type says\n" +
                                    "about you"
                            articleHeader2.text = partHeaderBT2String
                            articleHeader2.setVisibility(View.VISIBLE)
                            val partArticleBT2String = "\n" +
                                    "Those with blood type AB are considered a unique mix of the rational precision of Type As and the creative free-spiritedness of Type Bs. They are adaptable, diplomatic rational thinkers who can be analytical yet open-minded. However, ABs can also come across as aloof, indecisive, emotionally detached, secretive, and avoidant of conflict. They seek intellectual and emotional connections but can struggle with neediness. Overall, ABs are complex personalities who value space and independence."
                            articleText2.text = partArticleBT2String
                            articleText2.setVisibility(View.VISIBLE)

//                      Traits
                            val PosTraitsStringPart = PosTraitsTextPart
                            val PosTraits = "Rational\n" +
                                    "Adaptable\n" +
                                    "Diplomatic\n" +
                                    "Analytical\n" +
                                    "Open-minded"
                            PosTraitsStringPart.text = PosTraits
                            PosTraitsImagePart.setVisibility(View.VISIBLE)

                            val NegTraitsString = NegTraitsTextPart
                            val NegTraitsPart = "Aloof\n" +
                                    "Indecisive\n" +
                                    "Detached\n" +
                                    "Secretive\n" +
                                    "Unconfrontational"
                            NegTraitsString.text = NegTraitsPart
                            NegTraitsImagePart.setVisibility(View.VISIBLE)

                        }
                        2 -> {
                            // Type B
                            // ... (existing code for Type B)
                            //                      Interactive bond text
                            bloodTypeImagePart.setVisibility(View.VISIBLE)
                            bloodTypeImagePart.setImageResource(R.drawable.blood_b)

                            val intertextPartO = bondPartText
                            val bloodTypeOString = "B"
                            intertextPartO.text = bloodTypeOString

                            //                       Article text
                            val partHeaderBT2String = "What being a B type says\n" +
                                    "about you"
                            articleHeader2.text = partHeaderBT2String
                            articleHeader2.setVisibility(View.VISIBLE)
                            val partArticleBT2String = "\n" +
                                    "People with blood type B are described as easygoing, creative independents who are honest and optimistic. On the negative side, they can be self-centered, impulsive, insensitive, struggle with rules, and be unreliable at times. Type Bs crave freedom and get bored easily, but are also passionate go-getters. In relationships, they need space and shared interests over clinginess."
                            articleText2.text = partArticleBT2String
                            articleText2.setVisibility(View.VISIBLE)

//                      Traits
                            val PosTraitsStringPart = PosTraitsTextPart
                            val PosTraits = "Easygoing\n" +
                                    "Independent\n" +
                                    "Creative\n" +
                                    "Optimistic\n" +
                                    "Honest"
                            PosTraitsStringPart.text = PosTraits
                            PosTraitsImagePart.setVisibility(View.VISIBLE)

                            val NegTraitsString = NegTraitsTextPart
                            val NegTraitsPart = "Self-centered\n" +
                                    "Impulsive\n" +
                                    "Insensitive\n" +
                                    "Defiant\n" +
                                    "Flaky"
                            NegTraitsString.text = NegTraitsPart
                            NegTraitsImagePart.setVisibility(View.VISIBLE)
                        }
                        3 -> {
                            // Type O
                            // ... (existing code for Type O)
                            bloodTypeImagePart.setVisibility(View.VISIBLE)
                            bloodTypeImagePart.setImageResource(R.drawable.blood_o)

                            val intertextPartO = bondPartText
                            val bloodTypeOString = "O"
                            intertextPartO.text = bloodTypeOString

                            //                       Article text
                            val partHeaderBT2String = "What being an O type says\n" +
                                    "about you"
                            articleHeader2.text = partHeaderBT2String
                            articleHeader2.setVisibility(View.VISIBLE)
                            val partArticleBT2String = "\n" +
                                    "People with blood type O are seen as confident, outgoing natural leaders who are strong-willed and adventurous. They are able to make decisive choices with an optimistic outlook. However, they can also come across as arrogant, insensitive to others' feelings, impatient, reckless, and dominating at times. Os have a charismatic presence but may struggle to openly express emotions. In relationships, they desire admiration for their confidence and an active, outgoing partner while needing space. Overall, Os make take-charge leaders who value decisiveness but can lack sensitivity."
                            articleText2.text = partArticleBT2String
                            articleText2.setVisibility(View.VISIBLE)

//                      Traits
                            val PosTraitsStringPart = PosTraitsTextPart
                            val PosTraits = "Confident\n" +
                                    "Natural leaders\n" +
                                    "Decisive\n" +
                                    "Adventurous\n" +
                                    "Charismatic"
                            PosTraitsStringPart.text = PosTraits
                            PosTraitsImagePart.setVisibility(View.VISIBLE)

                            val NegTraitsString = NegTraitsTextPart
                            val NegTraitsPart = "Arrogant\n" +
                                    "Insensitive\n" +
                                    "Impatient\n" +
                                    "Reckless\n" +
                                    "Dominating"
                            NegTraitsString.text = NegTraitsPart
                            NegTraitsImagePart.setVisibility(View.VISIBLE)
                        }
                    }
                }
            } else {
                Toast.makeText(this, "Please select PARTNER's blood type", Toast.LENGTH_LONG).show()
            }
        }

    }

}

