package com.finix.sampletokenize.ui.compose.addCard

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import com.finix.finixpaymentsheet.domain.model.PaymentSheetColors
import com.finix.finixpaymentsheet.domain.model.PaymentSheetConfiguration
import com.finix.finixpaymentsheet.domain.model.PaymentSheetEnvironment
import com.finix.finixpaymentsheet.domain.model.PaymentSheetResources
import com.finix.sampletokenize.R
import com.finix.sampletokenize.ui.theme.FinixBlue
import com.finix.sampletokenize.ui.theme.FinixErrorRed
import com.finix.sampletokenize.ui.theme.FinixErrorTextSurface
import com.finix.sampletokenize.ui.theme.FinixGray
import com.finix.sampletokenize.ui.theme.FinixRed

// Sandbox demo values. Swap for your own Finix Application ID and
// PaymentSheetEnvironment.LIVE when wiring this up for production.
private const val DEMO_APPLICATION_ID = "APjMB6owJ7542dehJ6hCojzR"

class AddCardViewModel : ViewModel() {

    var state by mutableStateOf(
        AddCardState(
            paymentSheetConfiguration = PaymentSheetConfiguration(
                applicationId = DEMO_APPLICATION_ID,
                environment = PaymentSheetEnvironment.SANDBOX,
            ),
            paymentSheetResources = PaymentSheetResources(
                logoDrawable = R.drawable.ic_logo,
                logoText = R.string.daphneys_corner,
                tokenizeButtonText = R.string.btn_tokenize,
                cancelButtonText = R.string.btn_cancel,
            ),
            paymentSheetColors = PaymentSheetColors(
                surface = Color.White,
                errorContainerColor = FinixErrorTextSurface,
                containerColor = FinixGray,
                focusedIndicatorColor = FinixBlue,
                unfocusedIndicatorColor = Color.Transparent,
                focusedLabelColor = FinixBlue,
                unfocusedLabelColor = Color.Black,
                errorLabelColor = FinixErrorRed,
                tokenizeButtonColor = FinixBlue,
                cancelButtonColor = FinixRed,
            ),
        )
    )

    fun setTokenResponse(response: String) {
        state = state.copy(tokenResponseString = response)
    }

    fun setShowFinixPaymentSheetSelection(show: Boolean) {
        state = state.copy(showFinixPaymentSheetSelection = show)
    }

    fun setShowCompletePaymentSheetOutlined(show: Boolean) {
        state = state.copy(showCompletePaymentSheetOutlined = show)
    }

    fun setShowPartialPaymentSheetOutlined(show: Boolean) {
        state = state.copy(showPartialPaymentSheetOutlined = show)
    }

    fun setShowBasicPaymentSheetOutlined(show: Boolean) {
        state = state.copy(showBasicPaymentSheetOutlined = show)
    }

    fun setShowMinimalPaymentSheetOutlined(show: Boolean) {
        state = state.copy(showMinimalPaymentSheetOutlined = show)
    }

    fun setShowCompletePaymentSheet(show: Boolean) {
        state = state.copy(showCompletePaymentSheet = show)
    }

    fun setShowPartialPaymentSheet(show: Boolean) {
        state = state.copy(showPartialPaymentSheet = show)
    }

    fun setShowBasicPaymentSheet(show: Boolean) {
        state = state.copy(showBasicPaymentSheet = show)
    }

    fun setShowMinimalPaymentSheet(show: Boolean) {
        state = state.copy(showMinimalPaymentSheet = show)
    }
}
