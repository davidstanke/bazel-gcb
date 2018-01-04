# utility script to print the Bazel version number to the command line
# bazel.version_number is only available via repository_rule (why?)
# so we create a dummy repository.

def _impl(repository_ctx):
    repository_ctx.file('foo.sh','')
    repository_ctx.file('BUILD','sh_binary(name="foo",srcs=["foo.sh"],visibility=["//visibility:public"])')
    # the actual work happens here
    print("Bazel version: " + native.bazel_version) 

bazel_version = repository_rule(
	implementation=_impl,
	local=True,
	)