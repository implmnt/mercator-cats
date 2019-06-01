scalaVersion := "2.12.8"

organization := "im.plmnt"
name := "mercator-cats"

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
homepage := Some(url("http://github.com/implmnt/mercator-cats"))

useGpg := true

scalafmtOnCompile := true
testFrameworks += new TestFramework("minitest.runner.Framework")
