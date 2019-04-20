PATH_TO_FX = javafx-sdk-11.0.2/lib
FLAGS = --module-path $(PATH_TO_FX) --add-modules=javafx.controls
Sudoku = Sudoku.java
Interface = Interface.java
Grid = Grid.java
Tile = Tile.java
Square = Square.java Tile.java

default: Interface
%: %.java
	javac $(FLAGS) $($@)
	java $(FLAGS) -ea $@