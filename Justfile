help:
    just --list

clean:
    rm -rf build

compile: clean
    javac \
        --module-source-path "./*/src" \
        --module joe.lang,joe.compiler,example \
        -g \
        -d build/compile