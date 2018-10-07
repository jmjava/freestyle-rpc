version := sys.props("version")

resolvers += Resolver.bintrayRepo("beyondthelines", "maven")

libraryDependencies ++= Seq(
  "io.higherkindness" %% "frees-rpc-server" % sys.props("version")
)
