package Basics

import java.util.TreeMap

fun main(args:Array<String>)
{
	var allians=TreeMap<String,Int>()
	allians["Abhi"]=100
	allians["Balu"]=123
	for((name,age) in allians)
		println("Name:$name Age:$age")
}

