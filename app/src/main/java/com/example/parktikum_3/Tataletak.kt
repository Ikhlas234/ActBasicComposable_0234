Spacer(modifier = Modifier.height(height = 10.dp))
Box(
modifier = modifier
.fillMaxWidth()
.height(height = 300.dp)
.background(color = Color.Cyan),
contentAlignment = Alignment.Center
){
    Image(painter = gambar,
        contentDescription = null,
        contentScale = ContentScale.Fit)
    Text(text = "My Music",
        fontSize = 50.sp,
        color = Color.Red,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Cursive,
        modifier = Modifier.align(
            alignment = Alignment.Center)
    )
}
}
}








