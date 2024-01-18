package main

import (
	"encoding/json"
	"fmt"
)

type Foo struct {
	Foo string `json:"foo,omitempty"`
	Bar string `json:"bar,omitempty"`
}

type Bar struct {
	Bar string `json:"bar"`
}

type FooBar struct {
	Foo Foo `json:"foo,omitempty"`
	Bar Bar `json:"bar"`
}

func NewFooBar(foo Foo, bar Bar) FooBar {
	return FooBar{
		Foo: foo,
		Bar: bar,
	}
}

func NewFooBar2(bar Bar) FooBar {
	return FooBar{
		Bar: bar,
	}
}

func main() {
	obj := NewFooBar2(Bar{Bar: "bar"})
	o, err := json.Marshal(obj)
	if err != nil {
		panic(err)
	}
	fmt.Println(string(o))
}
