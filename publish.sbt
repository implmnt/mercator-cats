import xerial.sbt.Sonatype._

publishTo := sonatypePublishTo.value
publishMavenStyle := true
sonatypeProjectHosting := Some(GitHubHosting("Georgy Davityan", "mercator-cats", "georgy.davityan@gmail.com"))

credentials += Credentials(
  "Sonatype Nexus Repository Manager",
  "oss.sonatype.org",
  sys.env("sonatype_username"),
  sys.env("sonatype_password")
)