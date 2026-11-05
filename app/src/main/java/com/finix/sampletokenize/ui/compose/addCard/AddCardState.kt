package com.finix.sampletokenize.ui.compose.addCard

import com.finix.finixpaymentsheet.domain.model.PaymentSheetColors
import com.finix.finixpaymentsheet.domain.model.PaymentSheetConfiguration
import com.finix.finixpaymentsheet.domain.model.PaymentSheetResources

data class AddCardState(

    val tokenResponseString: String = "",

    val showFinixPaymentSheetSelection: Boolean = false,

    val showCompletePaymentSheetOutlined: Boolean = false,
    val showPartialPaymentSheetOutlined: Boolean = false,
    val showBasicPaymentSheetOutlined: Boolean = false,
    val showMinimalPaymentSheetOutlined: Boolean = false,

    val showCompletePaymentSheet: Boolean = false,
    val showPartialPaymentSheet: Boolean = false,
    val showBasicPaymentSheet: Boolean = false,
    val showMinimalPaymentSheet: Boolean = false,

    val paymentSheetConfiguration: PaymentSheetConfiguration,

    val paymentSheetResources: PaymentSheetResources = PaymentSheetResources(),
    val paymentSheetColors: PaymentSheetColors = PaymentSheetColors(),
)
