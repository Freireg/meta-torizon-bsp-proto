# Sample recipe kept lint-clean against .github/workflows/oelint-rulefile.json.
# Verify with:
#   oelint-adv --rulefile .github/workflows/oelint-rulefile.json --relpaths recipes-example/lint-test/lint-test_1.0.bb

SUMMARY = "Dummy recipe used to exercise the oelint-adv rulefile"
DESCRIPTION = "Minimal recipe kept lint-clean against the project rulefile"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PROVIDES = "dummy-lint-test"

SRC_URI = "file://foo.txt file://bar.txt"
RDEPENDS:${PN} = "bash"

do_install () {
    install -d ${D}${bindir}
    echo "installed"
}

do_mytask () {
    echo "custom task with a valid name"
}

addtask mytask after do_install
