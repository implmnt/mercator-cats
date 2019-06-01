# mercator-cats
Derives [mercator](https://github.com/propensive/mercator) Monadic for [cats](https://github.com/org.typelevel/cats) Monad

[![Build Status](https://travis-ci.org/implmnt/mercator-cats.svg?branch=master)](https://travis-ci.org/implmnt/mercator-cats)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/im.plmnt/mercator-cats_2.12/badge.svg)](https://maven-badges.herokuapp.com/maven-central/im.plmnt/mercator-cats_2.12)

## Usage

Add to your `build.sbt`
```scala
libraryDependencies += "im.plmnt" %% "mercator-cats" % "0.1.0"
```

Can be used with magnolia combine if the Monad instance exists for Typeclass
```scala
import im.plmnt.mercator.cats._

type Typeclass[T]

def combine[T](caseClass: CaseClass[Typeclass, T]): Typeclass[T] =
  caseClass.constructMonadic { param => 
    ...
  }
```
