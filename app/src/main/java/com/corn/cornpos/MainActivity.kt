package com.corn.cornpos

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.FragmentActivity
import com.corn.cornpos.data.CornPosDataStore
import com.corn.cornpos.ui.screen.MainScreen
import com.corn.cornpos.ui.theme.CornPosTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : FragmentActivity() {
    lateinit var dataStore : CornPosDataStore
    override fun onCreate(savedInstanceState: Bundle?) {
        dataStore = CornPosDataStore(application)
        super.onCreate(savedInstanceState)
        setContent {
            CornPosTheme {
            MainScreen(this@MainActivity)
            }
        }
    }

}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CornPosTheme {

    }
}