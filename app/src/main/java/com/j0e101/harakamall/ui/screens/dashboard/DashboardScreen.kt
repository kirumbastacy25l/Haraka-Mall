package com.j0e101.harakamall.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.j0e101.harakamall.R
import com.j0e101.harakamall.navigation.ROUT_ABOUT
import com.j0e101.harakamall.navigation.ROUT_HOME
import com.j0e101.harakamall.ui.theme.neworange
import com.j0e101.harakamall.ui.theme.neworange1


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize()
            .background(neworange)
            .verticalScroll(rememberScrollState())
    ){

        //Box
        Box () { //Card
            Card(
                modifier = Modifier.fillMaxWidth().height(300.dp),
                shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
                colors = CardDefaults.cardColors(neworange1)


            ) {
                TopAppBar(

                    title = { Text(text = "Dashboard Section") },
                    navigationIcon = {
                        IconButton(onClick = {}) {
                            Icon(imageVector = Icons.Default.Menu, contentDescription = "menu")
                        }


                    }
                )


            }
            //End of card

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .align(alignment = Alignment.BottomCenter)
                    .padding(start = 20.dp, end = 20.dp)
                    .offset(y=90.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.mall),
                    contentDescription = "home",
                    modifier = Modifier.fillMaxWidth().height(100.dp),
                )

                Text(text = "Welcome to HarakaMall where we help our clients choose the best products they need!")
                Text(text = "To access any of our information,click on the homepage,about,call or products and have fun getting to know more about us!")




            }
            //CONTENTS OF CARD

        }
        //End of box
        Spacer(modifier = Modifier.height(100.dp))


        //ROW
        Row(modifier = Modifier.padding(start = 40.dp, end = 40.dp)
        ) {
            //Card1
            Card(
                modifier = Modifier
                    .width(150.dp)
                    .height(180.dp)
                    .clickable{navController.navigate(ROUT_HOME)},

                elevation = CardDefaults.cardElevation(10.dp)
            ) {

             Column(
                 modifier = Modifier.fillMaxSize(),
                 horizontalAlignment = Alignment.CenterHorizontally,
                 verticalArrangement = Arrangement.Center

             ){
                 Image(
                     painter = painterResource(R.drawable.home),
                     contentDescription = "home",
                     modifier = Modifier.fillMaxWidth().height(100.dp),
                     )
                 Text(text = "Home", fontSize = 15.sp)



             }



            }



        //End of card1

            Spacer(modifier = Modifier.width(20.dp))
            //Card2
            Card( modifier = Modifier
                .width(150.dp)
                .height(180.dp)
                .clickable{navController.navigate(ROUT_ABOUT)},
                elevation = CardDefaults.cardElevation(10.dp)
            ) {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                ){
                    Image(
                        painter = painterResource(R.drawable.about),
                        contentDescription = "home",
                        modifier = Modifier.fillMaxWidth().height(100.dp),
                    )
                    Text(text = "About us", fontSize = 15.sp)



                }



            }



            //End of card2



        }
        //End of row
        Spacer(modifier = Modifier.height(20.dp))
        //ROW
        Row(modifier = Modifier.padding(start = 40.dp, end = 40.dp)
        ) {
            //Card1
            Card( modifier = Modifier
                .width(150.dp)
                .height(180.dp),

                elevation = CardDefaults.cardElevation(10.dp)
            ) {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                ){
                    Image(
                        painter = painterResource(R.drawable.contact),
                        contentDescription = "home",
                        modifier = Modifier.fillMaxWidth().height(100.dp),
                    )
                    Text(text = "Contact us", fontSize = 15.sp)



                }



            }



            //End of card1

            Spacer(modifier = Modifier.width(20.dp))
            //Card2
            Card( modifier = Modifier.width(150.dp).height(180.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                ){
                    Image(
                        painter = painterResource(R.drawable.product),
                        contentDescription = "home",
                        modifier = Modifier.fillMaxWidth().height(100.dp),
                    )
                    Text(text = "Products offered", fontSize = 15.sp)



                }



            }



            //End of card2



        }
        //End of row



    }
























}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())


}