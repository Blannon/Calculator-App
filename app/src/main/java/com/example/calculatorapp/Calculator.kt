package com.example.calculatorapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculatorapp.ui.theme.LightGray
import com.example.calculatorapp.ui.theme.Orange

@Composable
fun Calculator (
    state: CalculatorState,
    modifier: Modifier = Modifier,
    buttonSpacing: Dp = 8.dp,
    onAction : (CalculatorAction) -> Unit
){
    Box(
        modifier = modifier
//            .fillMaxSize()
//            .background(Color.DarkGray)
//            .padding(16.dp)
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Text(
                text =state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontSize = 80.sp,
                fontWeight = FontWeight.Light,
                color = Color.White,
                maxLines = 2
            )
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorBtn(
                    symbol ="AC",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(2f)
                        .weight(2f)
                ) {
                    onAction(CalculatorAction.Clear)
                }
                CalculatorBtn(
                    symbol ="Del",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Delete)
                }
                CalculatorBtn(
                    symbol ="/",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
                }
            }

            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorBtn(
                    symbol ="7",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Number(7))
                }
                CalculatorBtn(
                    symbol ="8",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Number(8))
                }
                CalculatorBtn(
                    symbol ="9",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Number(9))
                }
                CalculatorBtn(
                    symbol ="X",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
                }
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorBtn(
                    symbol ="4",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Number(4))
                }
                CalculatorBtn(
                    symbol ="5",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Number(5))
                }
                CalculatorBtn(
                    symbol ="6",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Number(6))
                }
                CalculatorBtn(
                    symbol ="-",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Operation(CalculatorOperation.Subtract))
                }
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorBtn(
                    symbol ="1",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Number(1))
                }
                CalculatorBtn(
                    symbol ="2",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Number(2))
                }
                CalculatorBtn(
                    symbol ="3",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Number(3))
                }
                CalculatorBtn(
                    symbol ="+",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Operation(CalculatorOperation.Add))
                }
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorBtn(
                    symbol ="0",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(2f)
                        .weight(2f)
                ) {
                    onAction(CalculatorAction.Number(0))
                }
                CalculatorBtn(
                    symbol =".",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Decimal)
                }
                CalculatorBtn(
                    symbol ="=",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Calculate)
                }
            }
        }
    }
}