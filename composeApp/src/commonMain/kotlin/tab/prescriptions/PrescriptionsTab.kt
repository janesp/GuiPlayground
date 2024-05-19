package tab.prescriptions

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import cafe.adriel.voyager.transitions.SlideTransition
import screen.prescriptions.PrescriptionsScreen

object PrescriptionsTab : Tab {
    @Composable
    override fun Content() {
        Navigator(PrescriptionsScreen()) { navigator ->
            SlideTransition((navigator))
        }
    }

    override val options: TabOptions
        @Composable
        get() {
            val title = "Drugs"
            val icon = rememberVectorPainter(Icons.Default.Face)

            return remember {
                TabOptions(
                    index = 5u,
                    title = title,
                    icon = icon
                )
            }
        }

}