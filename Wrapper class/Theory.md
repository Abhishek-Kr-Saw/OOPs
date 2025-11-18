Wrapper classes :

- Java provides a wrapper class for every primitive type.

Primitive	Wrapper Class
byte	    Byte
short	    Short
int	        Integer
long	    Long
float	    Float
double	    Double
char	    Character
boolean	    Boolean

- Wrapper classes convert primitives into objects.

Need : 
- 1. Collections work only with objects

List<int> list = new ArrayList<>();  -> error
List<Integer> list = new ArrayList<>();  -> will work

- 2. Useful utility methods
int number = Integer.parseInt("123");

- 3. Support for OOP concepts