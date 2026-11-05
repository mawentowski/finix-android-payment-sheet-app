package com.finix.sampletokenize.ui.compose.addCard.components

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.Composable
import com.finix.finixpaymentsheet.ui.viewModel.paymentSheet.*
import com.finix.sampletokenize.ui.compose.addCard.AddCardViewModel

// Fixed amount/currency for the demo; a real integration would surface these
// from the cart. Unit is the smallest currency unit (cents for USD).
private const val DEMO_AMOUNT_CENTS = 100L
private const val DEMO_CURRENCY = "USD"

@Composable
fun ShowCompletePaymentSheetOutlined(viewModel: AddCardViewModel, context: Context) {
    CompletePaymentSheetOutlined(
        configuration = viewModel.state.paymentSheetConfiguration,
        amount = DEMO_AMOUNT_CENTS,
        currency = DEMO_CURRENCY,
        onCancel = {
            viewModel.setShowCompletePaymentSheetOutlined(false)
            viewModel.setShowFinixPaymentSheetSelection(show = true)
            Toast.makeText(context, "onCancel!", Toast.LENGTH_SHORT).show()
        },
        onSuccess = { response ->
            viewModel.setShowCompletePaymentSheetOutlined(false)
            viewModel.setShowFinixPaymentSheetSelection(show = true)
            Toast.makeText(context, "onSuccess: ${response.tokenizedResponse.id}", Toast.LENGTH_SHORT).show()
            viewModel.setTokenResponse(response.tokenizedResponse.toString())
        },
        onFailure = { error ->
            viewModel.setShowCompletePaymentSheetOutlined(false)
            viewModel.setShowFinixPaymentSheetSelection(show = true)
            Toast.makeText(context, "onFailure: $error", Toast.LENGTH_LONG).show()
        },
        paymentSheetColors = viewModel.state.paymentSheetColors,
        paymentSheetResources = viewModel.state.paymentSheetResources,
    )
}

@Composable
fun ShowPartialPaymentSheetOutlined(viewModel: AddCardViewModel, context: Context) {
    PartialPaymentSheetOutlined(
        configuration = viewModel.state.paymentSheetConfiguration,
        amount = DEMO_AMOUNT_CENTS,
        currency = DEMO_CURRENCY,
        onCancel = {
            viewModel.setShowPartialPaymentSheetOutlined(false)
            Toast.makeText(context, "onCancel", Toast.LENGTH_SHORT).show()
        },
        onSuccess = { response ->
            viewModel.setShowPartialPaymentSheetOutlined(false)
            Toast.makeText(context, "onSuccess: ${response.tokenizedResponse.id}", Toast.LENGTH_SHORT).show()
            viewModel.setTokenResponse(response.tokenizedResponse.toString())
        },
        onFailure = { error ->
            viewModel.setShowPartialPaymentSheetOutlined(false)
            Toast.makeText(context, "onFailure: $error", Toast.LENGTH_LONG).show()
        },
        paymentSheetColors = viewModel.state.paymentSheetColors,
        paymentSheetResources = viewModel.state.paymentSheetResources,
    )
}

@Composable
fun ShowBasicPaymentSheetOutlined(viewModel: AddCardViewModel, context: Context) {
    BasicPaymentSheetOutlined(
        configuration = viewModel.state.paymentSheetConfiguration,
        amount = DEMO_AMOUNT_CENTS,
        currency = DEMO_CURRENCY,
        onCancel = {
            viewModel.setShowBasicPaymentSheetOutlined(false)
            Toast.makeText(context, "onCancel", Toast.LENGTH_SHORT).show()
        },
        onSuccess = { response ->
            viewModel.setShowBasicPaymentSheetOutlined(false)
            Toast.makeText(context, "onSuccess: ${response.tokenizedResponse.id}", Toast.LENGTH_SHORT).show()
            viewModel.setTokenResponse(response.tokenizedResponse.toString())
        },
        onFailure = { error ->
            viewModel.setShowBasicPaymentSheetOutlined(false)
            Toast.makeText(context, "onFailure: $error", Toast.LENGTH_LONG).show()
        },
        paymentSheetColors = viewModel.state.paymentSheetColors,
        paymentSheetResources = viewModel.state.paymentSheetResources,
    )
}

@Composable
fun ShowMinimalPaymentSheetOutlined(viewModel: AddCardViewModel, context: Context) {
    MinimalPaymentSheetOutlined(
        configuration = viewModel.state.paymentSheetConfiguration,
        amount = DEMO_AMOUNT_CENTS,
        currency = DEMO_CURRENCY,
        onCancel = {
            viewModel.setShowMinimalPaymentSheetOutlined(false)
            Toast.makeText(context, "onCancel", Toast.LENGTH_SHORT).show()
        },
        onSuccess = { response ->
            viewModel.setShowMinimalPaymentSheetOutlined(false)
            Toast.makeText(context, "onSuccess: ${response.tokenizedResponse.id}", Toast.LENGTH_SHORT).show()
            viewModel.setTokenResponse(response.tokenizedResponse.toString())
        },
        onFailure = { error ->
            viewModel.setShowMinimalPaymentSheetOutlined(false)
            Toast.makeText(context, "onFailure: $error", Toast.LENGTH_LONG).show()
        },
        paymentSheetColors = viewModel.state.paymentSheetColors,
        paymentSheetResources = viewModel.state.paymentSheetResources,
    )
}

@Composable
fun ShowCompletePaymentSheet(viewModel: AddCardViewModel, context: Context) {
    CompletePaymentSheet(
        configuration = viewModel.state.paymentSheetConfiguration,
        amount = DEMO_AMOUNT_CENTS,
        currency = DEMO_CURRENCY,
        onCancel = {
            viewModel.setShowCompletePaymentSheet(false)
            Toast.makeText(context, "onCancel", Toast.LENGTH_SHORT).show()
        },
        onSuccess = { response ->
            viewModel.setShowCompletePaymentSheet(false)
            Toast.makeText(context, "onSuccess: ${response.tokenizedResponse.id}", Toast.LENGTH_SHORT).show()
            viewModel.setTokenResponse(response.tokenizedResponse.toString())
        },
        onFailure = { error ->
            viewModel.setShowCompletePaymentSheet(false)
            Toast.makeText(context, "onFailure: $error", Toast.LENGTH_LONG).show()
        },
        paymentSheetColors = viewModel.state.paymentSheetColors,
        paymentSheetResources = viewModel.state.paymentSheetResources,
    )
}

@Composable
fun ShowPartialPaymentSheet(viewModel: AddCardViewModel, context: Context) {
    PartialPaymentSheet(
        configuration = viewModel.state.paymentSheetConfiguration,
        amount = DEMO_AMOUNT_CENTS,
        currency = DEMO_CURRENCY,
        onCancel = {
            viewModel.setShowPartialPaymentSheet(false)
            Toast.makeText(context, "onCancel", Toast.LENGTH_SHORT).show()
        },
        onSuccess = { response ->
            viewModel.setShowPartialPaymentSheet(false)
            Toast.makeText(context, "onSuccess: ${response.tokenizedResponse.id}", Toast.LENGTH_SHORT).show()
            viewModel.setTokenResponse(response.tokenizedResponse.toString())
        },
        onFailure = { error ->
            viewModel.setShowPartialPaymentSheet(false)
            Toast.makeText(context, "onFailure: $error", Toast.LENGTH_LONG).show()
        },
        paymentSheetColors = viewModel.state.paymentSheetColors,
        paymentSheetResources = viewModel.state.paymentSheetResources,
    )
}

@Composable
fun ShowBasicPaymentSheet(viewModel: AddCardViewModel, context: Context) {
    BasicPaymentSheet(
        configuration = viewModel.state.paymentSheetConfiguration,
        amount = DEMO_AMOUNT_CENTS,
        currency = DEMO_CURRENCY,
        onCancel = {
            viewModel.setShowBasicPaymentSheet(false)
            Toast.makeText(context, "onCancel", Toast.LENGTH_SHORT).show()
        },
        onSuccess = { response ->
            viewModel.setShowBasicPaymentSheet(false)
            Toast.makeText(context, "onSuccess: ${response.tokenizedResponse.id}", Toast.LENGTH_SHORT).show()
            viewModel.setTokenResponse(response.tokenizedResponse.toString())
        },
        onFailure = { error ->
            viewModel.setShowBasicPaymentSheet(false)
            Toast.makeText(context, "onFailure: $error", Toast.LENGTH_LONG).show()
        },
        paymentSheetColors = viewModel.state.paymentSheetColors,
        paymentSheetResources = viewModel.state.paymentSheetResources,
    )
}

@Composable
fun ShowMinimalPaymentSheet(viewModel: AddCardViewModel, context: Context) {
    InternationalPaymentSheet(
        configuration = viewModel.state.paymentSheetConfiguration,
        amount = DEMO_AMOUNT_CENTS,
        currency = DEMO_CURRENCY,
        onCancel = {
            viewModel.setShowMinimalPaymentSheet(false)
            Toast.makeText(context, "onCancel", Toast.LENGTH_SHORT).show()
        },
        onSuccess = { response ->
            viewModel.setShowMinimalPaymentSheet(false)
            Toast.makeText(context, "onSuccess: ${response.tokenizedResponse.id}", Toast.LENGTH_SHORT).show()
            viewModel.setTokenResponse(response.tokenizedResponse.toString())
        },
        onFailure = { error ->
            viewModel.setShowMinimalPaymentSheet(false)
            Toast.makeText(context, "onFailure: $error", Toast.LENGTH_LONG).show()
        },
        paymentSheetColors = viewModel.state.paymentSheetColors,
        paymentSheetResources = viewModel.state.paymentSheetResources,
    )
}
