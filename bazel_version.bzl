def _impl(repository_ctx):
    repository_ctx.file('foo.sh','')
    repository_ctx.file('BUILD','sh_binary(name="foo",srcs=["foo.sh"],visibility=["//visibility:public"])')
    print("Bazel version: " + native.bazel_version)

bazel_version = repository_rule(
	implementation=_impl,
	local=True,
	)