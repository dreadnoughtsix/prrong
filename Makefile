JAVAC=javac
COMPF=-g
sources = $(wildcard *.java)
classes = $(sources:.java=.class)

all: $(classes)

clean:
	rm -f *.class

%.class : %.java
	$(JAVAC) $(COMPF) $< 

