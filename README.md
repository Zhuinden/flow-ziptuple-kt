# Flow-ZipTuple-KT

Ability to zip flows from 3 to 11 arity tuples.

(12 to 16 was freezing the Kotlin compiler, so those can be replaced with `zipArray`.)

``` kotlin
zipTuple(flow1, flow2, flow3)
    .collectLatest { (a, b, c) ->
        // ...
    }
```

## Using Flow-ZipTuple-KT

In order to use Flow-ZipTuple-KT, you need to add `jitpack` to your project root `build.gradle.kts`
(or `build.gradle`):

``` kotlin
// build.gradle.kts
allprojects {
    repositories {
        // ...
        maven { setUrl("https://jitpack.io") }
    }
    // ...
}
```

or

``` groovy
// build.gradle
allprojects {
    repositories {
        // ...
        maven { url "https://jitpack.io" }
    }
    // ...
}
```

and then, add the dependency to your module's `build.gradle.kts` (or `build.gradle`):

``` kotlin
// build.gradle.kts
implementation("com.github.Zhuinden:flow-ziptuple-kt:1.0.0")
```

or

``` groovy
// build.gradle
implementation 'com.github.Zhuinden:flow-ziptuple-kt:1.0.0'
```

## License

    Copyright 2020 Gabor Varadi

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.