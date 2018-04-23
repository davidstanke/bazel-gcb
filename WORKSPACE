load("//:bazel_version.bzl", "bazel_version")

http_archive(
  name = "bazel_toolchains",
  urls = [
    "https://mirror.bazel.build/github.com/bazelbuild/bazel-toolchains/archive/44200e0c026d86c53470d107b3697a3e46469c43.tar.gz",
    "https://github.com/bazelbuild/bazel-toolchains/archive/44200e0c026d86c53470d107b3697a3e46469c43.tar.gz",
  ],
  strip_prefix = "bazel-toolchains-44200e0c026d86c53470d107b3697a3e46469c43",
  sha256 = "699b55a6916c687f4b7dc092dbbf5f64672cde0dc965f79717735ec4e5416556",
)

bazel_version(name="bazel_version")

http_archive(
	name="com_davidstanke_bazelgcbutil",
	urls=["https://github.com/davidstanke/bazel-gcb-util/archive/v0.1.1.zip"],
	strip_prefix="bazel-gcb-util-0.1.1",
	sha256="30ae7a3baa45251ffd81003985e5185ced635aa5fe5ba3d67ad340a02cf5a994",
)
