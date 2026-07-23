# Throwaway recipe to smoke-test .github/workflows/oelint-rulefile.json.
# Every line below is deliberately wrong. Delete this file after testing.
# Run:  oelint-adv --rulefile .github/workflows/oelint-rulefile.json --relpaths recipes-example/lint-test/lint-test_1.0.bb

SUMMARY = "Dummy recipe with intentional oelint violations"
DESCRIPTION= "Recipe used to exercise the linter rulefile"
LICENSE = MIT
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

 PROVIDES = "dummy-lint-test"

PV  =  "1.0"

   

SRC_URI = "file://foo.txt"   
SRC_URI_append = " file://bar.txt"
RDEPENDS_${PN} = "bash"

do_install () {
	install -d ${D}${bindir};;
    echo "installed"   
}

do_my-task () {
    echo "task with a dash in its name"
}

addtask footask after do_install