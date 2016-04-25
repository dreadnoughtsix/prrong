JAVAC=javac
COMPF=-g

all: $(classes)

clean:
	rm -f *.class

%.class : %.java
	$(JAVAC) $(COMPF) $< 

