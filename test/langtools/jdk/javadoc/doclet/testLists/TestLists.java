/*
 * Copyright (c) 2013, 2021, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * @test
 * @bug 8241625 8241895 8242326 8261976
 * @summary test the lists generated by the doclet
 * @library  /tools/lib ../../lib
 * @modules  jdk.javadoc/jdk.javadoc.internal.tool
 * @build    toolbox.ToolBox javadoc.tester.*
 * @run main TestLists
 */

import java.io.IOException;
import java.nio.file.Path;

import javadoc.tester.JavadocTester;
import toolbox.ToolBox;

public class TestLists extends JavadocTester {

    public static void main(String... args) throws Exception {
        TestLists tester = new TestLists();
        tester.runTests(m -> new Object[]{Path.of(m.getName())});
    }

    private final ToolBox tb = new ToolBox();

    @Test
    public void testMemberLists(Path base) throws IOException {
        Path src = base.resolve("src");
        tb.writeJavaFiles(src,
                """
                    package p; public class C {
                      public C() { }
                      public C(int i) { }
                      public int f1;
                      public int f2;
                      public void m1() { }
                      public void m2() { }
                    }
                    """,
                """
                    package p; public enum E { E1, E2 }
                    """,
                """
                    package p; public @interface A { int value(); }
                    """
        );

        javadoc("-d", base.resolve("out").toString(),
                "-sourcepath", src.toString(),
                "p");
        checkExit(Exit.OK);

        checkOutput("p/C.html", true,
                """
                    <h2>Field Details</h2>
                    <ul class="member-list">
                    <li>
                    <section class="detail" id="f1">
                    <h3>f1</h3>
                    """,
                """
                    <h2>Constructor Details</h2>
                    <ul class="member-list">
                    <li>
                    <section class="detail" id="&lt;init&gt;()">
                    <h3>C</h3>""",
                """
                    <section class="method-details" id="method-detail">
                    <h2>Method Details</h2>
                    <ul class="member-list">
                    <li>
                    <section class="detail" id="m1()">
                    <h3>m1</h3>
                    """);

        checkOutput("p/E.html", true,
                """
                    <h2>Enum Constant Details</h2>
                    <ul class="member-list">
                    <li>
                    <section class="detail" id="E1">
                    """);

        checkOutput("p/A.html", true,
                """
                    <h2>Element Details</h2>
                    <ul class="member-list">
                    <li>
                    <section class="detail" id="value()">""");
    }

    @Test
    public void testDetailLists(Path base) throws IOException {
        Path src = base.resolve("src");
        tb.writeJavaFiles(src,
                """
                    package p; public class C {
                      public C() { }
                      public C(int i) { }
                      public int f1;
                      public int f2;
                      public void m1() { }
                      public void m2() { }
                    }
                    """,
                """
                    package p; public enum E { E1, E2 }
                    """,
                """
                    package p; public @interface A { int value(); }
                    """
        );

        javadoc("-d", base.resolve("out").toString(),
                "-sourcepath", src.toString(),
                "p");
        checkExit(Exit.OK);

        checkOutput("p/C.html", true,
                """
                    <section class="details">
                    <ul class="details-list">
                    <!-- ============ FIELD DETAIL =========== -->
                    <li>
                    <section class="field-details" id="field-detail">
                    <h2>Field Details</h2>
                    <ul class="member-list">""",
                """
                    </ul>
                    </section>
                    </li>
                    <!-- ========= CONSTRUCTOR DETAIL ======== -->
                    <li>
                    <section class="constructor-details" id="constructor-detail">
                    <h2>Constructor Details</h2>
                    <ul class="member-list">""");

        checkOutput("p/E.html", true,
                """
                    <section class="details">
                    <ul class="details-list">
                    <!-- ============ ENUM CONSTANT DETAIL =========== -->
                    <li>
                    <section class="constant-details" id="enum-constant-detail">
                    <h2>Enum Constant Details</h2>
                    <ul class="member-list">""");

        checkOutput("p/A.html", true,
                """
                    <ul class="details-list">
                    <!-- ============ ANNOTATION INTERFACE MEMBER DETAIL =========== -->
                    <li>
                    <section class="member-details">
                    <h2>Element Details</h2>
                    <ul class="member-list">""");
    }

    @Test
    public void testSummaryLists(Path base) throws IOException {
        Path src = base.resolve("src");
        tb.writeJavaFiles(src,
                """
                    package p; public class C {
                      public C() { }
                      public C(int i) { }
                      public int f1;
                      public int f2;
                      public void m1() { }
                      public void m2() { }
                    }
                    """,
                """
                    package p; public enum E { E1, E2 }
                    """,
                """
                    package p; public @interface A { int value(); }
                    """
        );

        javadoc("-d", base.resolve("out").toString(),
                "-sourcepath", src.toString(),
                "p");
        checkExit(Exit.OK);

        checkOutput("p/C.html", true,
                """
                    <section class="summary">
                    <ul class="summary-list">
                    <!-- =========== FIELD SUMMARY =========== -->
                    <li>
                    <section class="field-summary" id="field-summary">
                    <h2>Field Summary</h2>
                    <div class="caption"><span>Fields</span></div>
                    <div class="summary-table three-column-summary">""",
                """
                    </section>
                    </li>
                    <!-- ======== CONSTRUCTOR SUMMARY ======== -->
                    <li>
                    <section class="constructor-summary" id="constructor-summary">
                    <h2>Constructor Summary</h2>
                    <div class="caption"><span>Constructors</span></div>
                    <div class="summary-table two-column-summary">""");

        checkOutput("p/E.html", true,
                """
                    </section>
                    </li>
                    <!-- =========== ENUM CONSTANT SUMMARY =========== -->
                    <li>
                    <section class="constants-summary" id="enum-constant-summary">
                    <h2>Enum Constant Summary</h2>
                    <div class="caption"><span>Enum Constants</span></div>
                    <div class="summary-table two-column-summary">""");

        checkOutput("p/A.html", true,
                """
                    <section class="summary">
                    <ul class="summary-list">
                    <!-- =========== ANNOTATION INTERFACE REQUIRED MEMBER SUMMARY =========== -->
                    <li>
                    <section class="member-summary" id="annotation-interface-required-element-summary">
                    <h2>Required Element Summary</h2>
                    <div class="caption"><span>Required Elements</span></div>
                    <div class="summary-table three-column-summary">""");

    }
}