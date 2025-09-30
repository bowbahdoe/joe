package pointers_to_structs

import "fmt"

type Vertex struct {
	X int
	Y int
}

func f(v Vertex) {
	v.X = 4
}

func g(v *Vertex) {
	v.X = 4
	*v = Vertex{4, 0}
}

func (v *Vertex) h() {
	v.X = 0
}

func main() {
	v := Vertex{1, 2}
	f(v)
	p := &v
	p.X = 1e9
	xptr := &v.X
	g(p)
	fmt.Println(v)
}
