# GsonParse

GsonParse is base on Gson that is compatible with some regular data conversion.

### Data conversion
* boolean deserialization 
  * string to boolean
    * "1" -> true
    * other value -> false
  * int to boolean
    * 1 -> true
    * other value -> false

* int deserialization
  * string to int
    * "true" -> 1
    * "false" -> 0
    * other value Integer.parseInt(value)
  * boolean to int
    * true -> 1
    * false -> 0

* string deserialization
  * boolean to string
    * Boolean.toString(in.nextBoolean());


### How to
*Step 1.* Add the JitPack repository to your build file
<br>
Add it in your root build.gradle at the end of repositories:
``` gradle 
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```

*Step 2.* Add the dependency

```gradle
	dependencies {
	        implementation 'com.github.lingyfh:GsonParse:0.1'
	}
```
