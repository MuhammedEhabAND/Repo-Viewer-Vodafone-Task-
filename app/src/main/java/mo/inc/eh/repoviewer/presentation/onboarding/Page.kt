package mo.inc.eh.repoviewer.presentation.onboarding

import androidx.annotation.DrawableRes
import mo.inc.eh.repoviewer.R

data class Page(
    val title : String,
    val description : String ,
    @DrawableRes val image : Int
)
val pages = listOf(
    Page(
        title = "Showing",
        description = "You can see each repo in github.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Favourite",
        description = "You can add any repo in github in your favourites.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Search",
        description = "You can search for any repo or user in github.",
        image = R.drawable.onboarding3
    ),
)
