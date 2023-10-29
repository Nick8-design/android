package com.example.composeecom

import android.widget.TextView
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun HomeScreen(){
Scaffold {
Column (modifier = Modifier.padding(it)){
MySearchBar()
    Spacer(modifier = Modifier.padding(16.dp))
    ProductList()

}
}
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun MySearchBar(){
    val borderWidth = 1.dp
    Row (verticalAlignment = Alignment.CenterVertically,  horizontalArrangement = Arrangement.Center,modifier = Modifier.fillMaxWidth(),) {

       TextField(value = "",
           onValueChange = {},
           placeholder = {
           Text(text = "Search")
       },
           shape = RoundedCornerShape(10.dp),
           trailingIcon = {
               Icon(imageVector = Icons.Filled.Search, contentDescription = "Search icon")
           },
           modifier = Modifier

               .border(

                   BorderStroke(borderWidth, Color.Black),
                   RoundedCornerShape(10.dp)

               )
               .padding(borderWidth)

           )
        Icon(imageVector = Icons.Filled.Favorite,contentDescription = "Filter icon")
    }
}
@Preview
@Composable
fun ProductList(){
    val borderWidth = 3.dp
    Row (verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
        Column (horizontalAlignment = Alignment.CenterHorizontally){
            Image(
                painter = painterResource(id = R.drawable.all),
                contentDescription = " all items" ,
                contentScale = ContentScale.Crop,
              modifier = Modifier
                  .size(50.dp)
                  .border(

                      BorderStroke(borderWidth, Color.White),
                      CircleShape
                  )
                  .padding(borderWidth)
                  .clip(CircleShape)
            )

            Text(text = "All")

        }
        Spacer(modifier = Modifier.padding(15.dp))


        Column (horizontalAlignment = Alignment.CenterHorizontally){
        Image(
            painter = painterResource(id = R.drawable.dress),
            contentDescription = "dress" ,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(50.dp)
                .border(

                    BorderStroke(borderWidth, Color.White),
                    CircleShape
                )
                .padding(borderWidth)
                .clip(CircleShape)
        )
        Text(text = "Clothing")

    }
        Spacer(modifier = Modifier.padding(15.dp))

        Column (horizontalAlignment = Alignment.CenterHorizontally){
            Image(
                painter = painterResource(id = R.drawable.specks),
                contentDescription = " specs" ,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(50.dp)
                    .border(

                        BorderStroke(borderWidth, Color.White),
                        CircleShape
                    )
                    .padding(borderWidth)
                    .clip(CircleShape)
            )
            Text(text = "Accessories")

        }
        Spacer(modifier = Modifier.padding(15.dp))
        Column (horizontalAlignment = Alignment.CenterHorizontally){

            Image(
                painter = painterResource(id = R.drawable.bag),
                contentDescription = "hand bag" ,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(50.dp)
                    .border(

                        BorderStroke(borderWidth, Color.White),
                        CircleShape
                    )
                    .padding(borderWidth)
                    .clip(CircleShape)
            )
            Text(text = "Bags")

        }


    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun MyOffers(){
    Row (verticalAlignment = Alignment.CenterVertically){
val paddingModifier = Modifier.padding(10.dp)
        Card (

            modifier = paddingModifier){
        /*    Image(painter = painterResource(id = R.drawable.offer),
                contentScale = ContentScale.Crop,
                contentDescription = "OFFER",
            modifier = Modifier
                .size(50.dp))*/
Column(modifier = paddingModifier) {

Text(text = "50% OFF")
    Text(text = "on all women's clothing")
}
        }


    }
}