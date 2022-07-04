package ru.netology.pusher

import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.Message
import java.io.FileInputStream

/*
fun main() {
    val options = FirebaseOptions.builder()
        .setCredentials(GoogleCredentials.fromStream(FileInputStream("fcm.json")))
        .build()

    FirebaseApp.initializeApp(options)

    val message = Message.builder()
        .putData("action", "LIKE")
        .putData("content", """{
          "userId": 1,
          "userName": "Vasiliy",
          "postId": 2,
          "postAuthor": "Netology"
        }""".trimIndent())
        .setToken("f5ShdhedQcGkLIQvFQZRin:APA91bExDR8FSJUtMAIWYJ3yyeeN_G4hZZNr-HVyMb0pkrb2PHtNQveuieo69phvPM_FXfkkDkaKsSuqH2rdhFj7Ol5cbxUjGN-H4HszNVoY0oyImjjo95-5Xhs_yQl4OAyNM0i4LBQh")
        .build()

    FirebaseMessaging.getInstance().send(message)
}
*/

fun main() {
    val options = FirebaseOptions.builder()
        .setCredentials(GoogleCredentials.fromStream(FileInputStream("fcm.json")))
        .build()

    FirebaseApp.initializeApp(options)

    val message = Message.builder()
        .putData("action", "NEW_POST")
        .putData(
            "content", """{
          "userId": 1,
          "userName": "Vasiliy",
          "postId": 3,
          "postContent": "Veryyyyyyy long post about me?, and my friends...because i blalbablalbalbala
          Veryyyyyyy long post about me?, and my friends...because i blalbablalbalbala
          Veryyyyyyy long post about me?, and my friends...because i blalbablalbalbala
          Veryyyyyyy long post about me?, and my friends...because i
          blalbablalbalbalaVeryyyyyyy long post about me?, and my friends...because i blalbablalbalbalaVeryyyyyyy long post about me?, and my friends...because i blalbablalbalbalaVeryyyyyyy long post about me?, and my friends...because i blalbablalbalbala
          
          
          "
        }""".trimIndent()
        )
        .setToken("f5ShdhedQcGkLIQvFQZRin:APA91bExDR8FSJUtMAIWYJ3yyeeN_G4hZZNr-HVyMb0pkrb2PHtNQveuieo69phvPM_FXfkkDkaKsSuqH2rdhFj7Ol5cbxUjGN-H4HszNVoY0oyImjjo95-5Xhs_yQl4OAyNM0i4LBQh")
        .build()

    FirebaseMessaging.getInstance().send(message)
}


