java_library (
	name="BazelGCB",
	srcs=glob(["src/main/java/com/example/*.java"]),
	deps=[
			"@com_davidstanke_bazelgcbutil//:BazelGCBUtil"
		],
)

java_test (
	name="BazelGCBTest",
	size="small",
	srcs=["src/test/java/com/example/BazelGCBTest.java"],
	deps = [
		":BazelGCB",
	]
)