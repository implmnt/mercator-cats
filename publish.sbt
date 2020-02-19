import xerial.sbt.Sonatype._

publishTo := sonatypePublishTo.value
publishMavenStyle := true
sonatypeProjectHosting := Some(GitHubHosting("Georgy Davityan", "mercator-cats", "georgy.davityan@gmail.com"))

