/*
 * Copyright (c) 2012, 2024, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
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
 * COPYRIGHT AND PERMISSION NOTICE
 *
 * Copyright (c) 1991-2020 Unicode, Inc. All rights reserved.
 * Distributed under the Terms of Use in https://www.unicode.org/copyright.html.
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of the Unicode data files and any associated documentation
 * (the "Data Files") or Unicode software and any associated documentation
 * (the "Software") to deal in the Data Files or Software
 * without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, and/or sell copies of
 * the Data Files or Software, and to permit persons to whom the Data Files
 * or Software are furnished to do so, provided that either
 * (a) this copyright and permission notice appear with all copies
 * of the Data Files or Software, or
 * (b) this copyright and permission notice appear in associated
 * Documentation.
 *
 * THE DATA FILES AND SOFTWARE ARE PROVIDED "AS IS", WITHOUT WARRANTY OF
 * ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT OF THIRD PARTY RIGHTS.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS INCLUDED IN THIS
 * NOTICE BE LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR CONSEQUENTIAL
 * DAMAGES, OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE,
 * DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
 * TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
 * PERFORMANCE OF THE DATA FILES OR SOFTWARE.
 *
 * Except as contained in this notice, the name of a copyright holder
 * shall not be used in advertising or otherwise to promote the sale,
 * use or other dealings in these Data Files or Software without prior
 * written authorization of the copyright holder.
 */

package sun.text.resources.cldr.ext;

import java.util.ListResourceBundle;

public class FormatData_lo extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_MonthNames = new String[] {
               "\u0ea1\u0eb1\u0e87\u0e81\u0ead\u0e99",
               "\u0e81\u0eb8\u0ea1\u0e9e\u0eb2",
               "\u0ea1\u0eb5\u0e99\u0eb2",
               "\u0ec0\u0ea1\u0eaa\u0eb2",
               "\u0e9e\u0eb6\u0e94\u0eaa\u0eb0\u0e9e\u0eb2",
               "\u0ea1\u0eb4\u0e96\u0eb8\u0e99\u0eb2",
               "\u0e81\u0ecd\u0ea5\u0eb0\u0e81\u0ebb\u0e94",
               "\u0eaa\u0eb4\u0e87\u0eab\u0eb2",
               "\u0e81\u0eb1\u0e99\u0e8d\u0eb2",
               "\u0e95\u0eb8\u0ea5\u0eb2",
               "\u0e9e\u0eb0\u0e88\u0eb4\u0e81",
               "\u0e97\u0eb1\u0e99\u0ea7\u0eb2",
               "",
            };
        final String[] metaValue_MonthAbbreviations = new String[] {
               "\u0ea1.\u0e81.",
               "\u0e81.\u0e9e.",
               "\u0ea1.\u0e99.",
               "\u0ea1.\u0eaa.",
               "\u0e9e.\u0e9e.",
               "\u0ea1\u0eb4.\u0e96.",
               "\u0e81.\u0ea5.",
               "\u0eaa.\u0eab.",
               "\u0e81.\u0e8d.",
               "\u0e95.\u0ea5.",
               "\u0e9e.\u0e88.",
               "\u0e97.\u0ea7.",
               "",
            };
        final String[] metaValue_DayNames = new String[] {
               "\u0ea7\u0eb1\u0e99\u0ead\u0eb2\u0e97\u0eb4\u0e94",
               "\u0ea7\u0eb1\u0e99\u0e88\u0eb1\u0e99",
               "\u0ea7\u0eb1\u0e99\u0ead\u0eb1\u0e87\u0e84\u0eb2\u0e99",
               "\u0ea7\u0eb1\u0e99\u0e9e\u0eb8\u0e94",
               "\u0ea7\u0eb1\u0e99\u0e9e\u0eb0\u0eab\u0eb1\u0e94",
               "\u0ea7\u0eb1\u0e99\u0eaa\u0eb8\u0e81",
               "\u0ea7\u0eb1\u0e99\u0ec0\u0eaa\u0ebb\u0eb2",
            };
        final String[] metaValue_DayAbbreviations = new String[] {
               "\u0ead\u0eb2\u0e97\u0eb4\u0e94",
               "\u0e88\u0eb1\u0e99",
               "\u0ead\u0eb1\u0e87\u0e84\u0eb2\u0e99",
               "\u0e9e\u0eb8\u0e94",
               "\u0e9e\u0eb0\u0eab\u0eb1\u0e94",
               "\u0eaa\u0eb8\u0e81",
               "\u0ec0\u0eaa\u0ebb\u0eb2",
            };
        final String[] metaValue_DayNarrows = new String[] {
               "\u0ead\u0eb2",
               "\u0e88",
               "\u0ead",
               "\u0e9e",
               "\u0e9e\u0eab",
               "\u0eaa\u0eb8",
               "\u0eaa",
            };
        final String[] metaValue_QuarterNames = new String[] {
               "\u0ec4\u0e95\u0ea3\u0ea1\u0eb2\u0e94 1",
               "\u0ec4\u0e95\u0ea3\u0ea1\u0eb2\u0e94 2",
               "\u0ec4\u0e95\u0ea3\u0ea1\u0eb2\u0e94 3",
               "\u0ec4\u0e95\u0ea3\u0ea1\u0eb2\u0e94 4",
            };
        final String[] metaValue_QuarterAbbreviations = new String[] {
               "\u0e95\u0ea11",
               "\u0e95\u0ea12",
               "\u0e95\u0ea13",
               "\u0e95\u0ea14",
            };
        final String[] metaValue_AmPmMarkers = new String[] {
               "\u0e81\u0ec8\u0ead\u0e99\u0e97\u0ec8\u0ebd\u0e87",
               "\u0eab\u0ebc\u0eb1\u0e87\u0e97\u0ec8\u0ebd\u0e87",
               "\u0e97\u0ec8\u0ebd\u0e87\u0e84\u0eb7\u0e99",
               "\u0e95\u0ead\u0e99\u0e97\u0ec8\u0ebd\u0e87",
               "\u0e95\u0ead\u0e99\u0ec0\u0e8a\u0ebb\u0ec9\u0eb2",
               "",
               "\u0e95\u0ead\u0e99\u0e9a\u0ec8\u0eb2\u0e8d",
               "",
               "\u0e95\u0ead\u0e99\u0ec1\u0ea5\u0e87",
               "",
               "\u0e95\u0ead\u0e99\u0e81\u0eb2\u0e87\u0e84\u0eb7\u0e99",
               "",
            };
        final String[] metaValue_narrow_AmPmMarkers = new String[] {
               "AM",
               "PM",
               "\u0e97\u0ec8\u0ebd\u0e87\u0e84\u0eb7\u0e99",
               "\u0e95\u0ead\u0e99\u0e97\u0ec8\u0ebd\u0e87",
               "\u0e95\u0ead\u0e99\u0ec0\u0e8a\u0ebb\u0ec9\u0eb2",
               "",
               "\u0e95\u0ead\u0e99\u0e97\u0ec8\u0ebd\u0e87",
               "",
               "\u0e95\u0ead\u0e99\u0ec1\u0ea5\u0e87",
               "",
               "\u0e81\u0eb2\u0e87\u0e84\u0eb7\u0e99",
               "",
            };
        final String[] metaValue_abbreviated_AmPmMarkers = new String[] {
               "\u0e81\u0ec8\u0ead\u0e99\u0e97\u0ec8\u0ebd\u0e87",
               "\u0eab\u0ebc\u0eb1\u0e87\u0e97\u0ec8\u0ebd\u0e87",
               "\u0e97\u0ec8\u0ebd\u0e87\u0e84\u0eb7\u0e99",
               "\u0e95\u0ead\u0e99\u0e97\u0ec8\u0ebd\u0e87",
               "\u0e95\u0ead\u0e99\u0ec0\u0e8a\u0ebb\u0ec9\u0eb2",
               "",
               "\u0e95\u0ead\u0e99\u0e9a\u0ec8\u0eb2\u0e8d",
               "",
               "\u0e95\u0ead\u0e99\u0ec1\u0ea5\u0e87",
               "",
               "\u0e81\u0eb2\u0e87\u0e84\u0eb7\u0e99",
               "",
            };
        final String[] metaValue_Eras = new String[] {
               "\u0e81\u0ec8\u0ead\u0e99 \u0e84.\u0eaa.",
               "\u0e84.\u0eaa.",
            };
        final String[] metaValue_TimePatterns = new String[] {
               "H \u0ec2\u0ea1\u0e87 m \u0e99\u0eb2\u0e97\u0eb5 ss \u0ea7\u0eb4\u0e99\u0eb2\u0e97\u0eb5 zzzz",
               "H \u0ec2\u0ea1\u0e87 m \u0e99\u0eb2\u0e97\u0eb5 ss \u0ea7\u0eb4\u0e99\u0eb2\u0e97\u0eb5 z",
               "H:mm:ss",
               "H:mm",
            };
        final String[] metaValue_buddhist_MonthNarrows = new String[] {
               "1",
               "2",
               "3",
               "4",
               "5",
               "6",
               "7",
               "8",
               "9",
               "10",
               "11",
               "12",
               "",
            };
        final String[] metaValue_buddhist_QuarterNarrows = new String[] {
               "1",
               "2",
               "3",
               "4",
            };
        final String[] metaValue_java_time_buddhist_long_Eras = new String[] {
               "BC",
               "\u0e9e.\u0eaa.",
            };
        final String[] metaValue_java_time_buddhist_DatePatterns = new String[] {
               "EEEE\u0e97\u0eb5 d MMMM y G",
               "d MMMM y G",
               "d MMM y G",
               "d/M/y GGGGG",
            };
        final String[] metaValue_buddhist_DatePatterns = new String[] {
               "EEEE\u0e97\u0eb5 d MMMM y GGGG",
               "d MMMM y GGGG",
               "d MMM y GGGG",
               "d/M/y G",
            };
        final String[] metaValue_java_time_japanese_long_Eras = new String[] {
               "\u0e84\u0ea3\u0eb4\u0e94\u0eaa\u0eb1\u0e81\u0e81\u0eb0\u0ea5\u0eb2\u0e94",
               "\u0ea1\u0eb5\u0e88\u0eb5",
               "\u0ec4\u0e95\u0ec2\u0e8a",
               "\u0ec2\u0e8a\u0ea7\u0eb2",
               "\u0eae\u0eb5\u0e8a\u0eb5",
               "Reiwa",
            };
        final String[] metaValue_java_time_japanese_Eras = new String[] {
               "\u0e84.\u0eaa.",
               "\u0ea1\u0eb5\u0e88\u0eb5",
               "\u0ec4\u0e95\u0ec2\u0e8a",
               "\u0ec2\u0e8a\u0ea7\u0eb2",
               "\u0eae\u0eb5\u0e8a\u0eb5",
               "Reiwa",
            };
        final String[] metaValue_java_time_roc_long_Eras = new String[] {
               "\u0e81\u0ec8\u0ead\u0e99 R.O.C.",
               "R.O.C.",
            };
        final String[] metaValue_java_time_islamic_long_Eras = new String[] {
               "",
               "AH",
            };
        final String metaValue_calendarname_gregorian = "\u0e9b\u0eb0\u0e95\u0eb4\u0e97\u0eb4\u0e99\u0ec0\u0e81\u0ea3\u0ec2\u0e81\u0ea3\u0ebd\u0e99";
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "field.year", "\u0e9b\u0eb5" },
            { "japanese.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.narrow.Eras", metaValue_java_time_buddhist_long_Eras },
            { "AmPmMarkers", metaValue_AmPmMarkers },
            { "java.time.japanese.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "standalone.QuarterAbbreviations",
                new String[] {
                    "\u0e951",
                    "\u0e952",
                    "\u0e953",
                    "\u0e954",
                }
            },
            { "roc.QuarterNames", metaValue_QuarterNames },
            { "roc.MonthNarrows", metaValue_buddhist_MonthNarrows },
            { "calendarname.islamic-civil", "\u0e9b\u0eb0\u0e95\u0eb4\u0e97\u0eb4\u0e99\u0ead\u0eb4\u0e94\u0eaa\u0eb0\u0ea5\u0eb2\u0ea1" },
            { "islamic.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "japanese.TimePatterns", metaValue_TimePatterns },
            { "narrow.Eras", metaValue_Eras },
            { "roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "abbreviated.AmPmMarkers", metaValue_abbreviated_AmPmMarkers },
            { "timezone.regionFormat.standard", "\u0ec0\u0ea7\u0ea5\u0eb2\u0ea1\u0eb2\u0e94\u0e95\u0eb0\u0e96\u0eb2\u0e99 {0}" },
            { "japanese.abbreviated.AmPmMarkers", metaValue_abbreviated_AmPmMarkers },
            { "calendarname.japanese", "\u0e9b\u0eb0\u0e95\u0eb4\u0e97\u0eb4\u0e99\u0e8d\u0eb5\u0ec8\u0e9b\u0eb8\u0ec8\u0e99" },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "standalone.DayAbbreviations", metaValue_DayAbbreviations },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "java.time.islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "long.Eras",
                new String[] {
                    "\u0e81\u0ec8\u0ead\u0e99\u0e84\u0ea3\u0eb4\u0e94\u0eaa\u0eb1\u0e81\u0e81\u0eb0\u0ea5\u0eb2\u0e94",
                    "\u0e84\u0ea3\u0eb4\u0e94\u0eaa\u0eb1\u0e81\u0e81\u0eb0\u0ea5\u0eb2\u0e94",
                }
            },
            { "roc.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "islamic.DayNames", metaValue_DayNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "DateTimePatterns",
                new String[] {
                    "{1}, {0}",
                    "{1}, {0}",
                    "{1}, {0}",
                    "{1}, {0}",
                }
            },
            { "narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "latn.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u0e9a\u0ecd\u0ec8\u200b\u0ec1\u0ea1\u0ec8\u0e99\u200b\u0ec2\u0e95\u200b\u0ec0\u0ea5\u0e81",
                    "",
                    "",
                }
            },
            { "japanese.DatePatterns", metaValue_buddhist_DatePatterns },
            { "buddhist.DayNames", metaValue_DayNames },
            { "field.minute", "\u0e99\u0eb2\u0e97\u0eb5" },
            { "japanese.long.Eras", metaValue_java_time_japanese_long_Eras },
            { "field.era", "\u0eaa\u0eb0\u0ec4\u0edd" },
            { "buddhist.AmPmMarkers", metaValue_AmPmMarkers },
            { "field.dayperiod", "\u0e81\u0ec8\u0ead\u0e99\u0e97\u0ec8\u0ebd\u0e87/\u0eab\u0ebc\u0eb1\u0e87\u0e97\u0ec8\u0ebd\u0e87" },
            { "islamic.MonthNames",
                new String[] {
                    "\u0ea1\u0eb8\u0ea3\u0eb0\u0eae\u0ead\u0ea1",
                    "\u0e8a\u0eb2\u0e9f\u0eb2\u0ea3",
                    "\u0eae\u0ead\u0e94\u0e9a\u0eb5 1",
                    "\u0eae\u0ead\u0e94\u0e9a\u0eb5 2",
                    "\u0e88\u0eb8\u0ea1\u0eb2\u0e94\u0eb2 1",
                    "\u0e88\u0eb8\u0ea1\u0eb2\u0e94\u0eb2 2",
                    "\u0eae\u0eb2\u0e88\u0eb1\u0e9a",
                    "\u0e8a\u0eb0\u0e9a\u0eb2\u0e99",
                    "\u0eae\u0eb2\u0ea1\u0eb2\u0e94\u0ead\u0e99",
                    "\u0ec0\u0e8a\u0ebb\u0eb2\u0ea7\u0eb1\u0e94",
                    "\u0e94\u0eb8\u0ead\u0eb1\u0e94\u0e81\u0eb4\u0e94\u0eb0",
                    "\u0e94\u0eb8\u0ead\u0eb1\u0e94\u0e81\u0eb4\u0e88\u0eb0",
                    "",
                }
            },
            { "japanese.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "calendarname.roc", "\u0e9b\u0eb0\u0e95\u0eb4\u0e97\u0eb4\u0e99\u0ec4\u0e95\u0ec9\u0eab\u0ea7\u0eb1\u0e99" },
            { "islamic.DatePatterns",
                new String[] {
                    "EEEE, y MMMM dd",
                    "y MMMM d",
                    "y MMM d",
                    "y-MM-dd",
                }
            },
            { "roc.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "field.month", "\u0ec0\u0e94\u0eb7\u0ead\u0e99" },
            { "java.time.japanese.long.Eras", metaValue_java_time_japanese_long_Eras },
            { "roc.Eras", metaValue_java_time_roc_long_Eras },
            { "field.second", "\u0ea7\u0eb4\u0e99\u0eb2\u0e97\u0eb5" },
            { "DayAbbreviations", metaValue_DayAbbreviations },
            { "DayNarrows", metaValue_DayNarrows },
            { "roc.DatePatterns", metaValue_buddhist_DatePatterns },
            { "calendarname.islamic", "\u0e9b\u0eb0\u0e95\u0eb4\u0e97\u0eb4\u0e99\u0ead\u0eb4\u0eaa\u0eb0\u0ea5\u0eb2\u0ea1" },
            { "java.time.roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "DayPeriodRules", "midnight:00:00;noon:12:00;night1:20:00-05:00;afternoon1:12:00-16:00;morning1:05:00-12:00;evening1:16:00-20:00" },
            { "java.time.roc.narrow.Eras", metaValue_java_time_roc_long_Eras },
            { "japanese.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "buddhist.TimePatterns", metaValue_TimePatterns },
            { "standalone.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "timezone.regionFormat", "\u0ec0\u0ea7\u0ea5\u0eb2 {0}" },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{other:0' '\u0e9e\u0eb1\u0e99}",
                    "{other:00' '\u0e9e\u0eb1\u0e99}",
                    "{other:0' '\u0ec1\u0eaa\u0e99}",
                    "{other:0' '\u0ea5\u0ec9\u0eb2\u0e99}",
                    "{other:00' '\u0ea5\u0ec9\u0eb2\u0e99}",
                    "{other:000' '\u0ea5\u0ec9\u0eb2\u0e99}",
                    "{other:0' '\u0e95\u0eb7\u0ec9}",
                    "{other:00' '\u0e95\u0eb7\u0ec9}",
                    "{other:000' '\u0e95\u0eb7\u0ec9}",
                    "{other:0' '\u0ea5\u0ec9\u0eb2\u0e99\u0ea5\u0ec9\u0eb2\u0e99}",
                    "{other:00' '\u0ea5\u0ec9\u0eb2\u0e99\u0ea5\u0ec9\u0eb2\u0e99}",
                    "{other:000' '\u0ea5\u0ec9\u0eb2\u0e99\u0ea5\u0ec9\u0eb2\u0e99}",
                }
            },
            { "roc.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "buddhist.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "standalone.QuarterNames", metaValue_QuarterNames },
            { "japanese.MonthNarrows", metaValue_buddhist_MonthNarrows },
            { "islamic.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "roc.DayAbbreviations", metaValue_DayAbbreviations },
            { "standalone.DayNarrows", metaValue_DayNarrows },
            { "java.time.buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "islamic.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "TimePatterns", metaValue_TimePatterns },
            { "islamic.DayNarrows", metaValue_DayNarrows },
            { "java.time.roc.Eras", metaValue_java_time_roc_long_Eras },
            { "field.zone", "\u0ec0\u0e82\u0e94\u0ec0\u0ea7\u0ea5\u0eb2" },
            { "japanese.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "roc.narrow.Eras", metaValue_java_time_roc_long_Eras },
            { "laoo.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u0ed0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                    "",
                    "",
                }
            },
            { "buddhist.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_abbreviated_AmPmMarkers },
            { "Eras", metaValue_Eras },
            { "roc.DayNames", metaValue_DayNames },
            { "islamic.QuarterNames", metaValue_QuarterNames },
            { "islamic.abbreviated.AmPmMarkers", metaValue_abbreviated_AmPmMarkers },
            { "field.weekday", "\u0ea1\u0eb7\u0ec9\u0e82\u0ead\u0e87\u0ead\u0eb2\u0e97\u0eb4\u0e94" },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic.DayAbbreviations", metaValue_DayAbbreviations },
            { "islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "java.time.islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "japanese.QuarterNames", metaValue_QuarterNames },
            { "buddhist.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "java.time.buddhist.Eras", metaValue_java_time_buddhist_long_Eras },
            { "japanese.DayNames", metaValue_DayNames },
            { "japanese.DayAbbreviations", metaValue_DayAbbreviations },
            { "DayNames", metaValue_DayNames },
            { "buddhist.DatePatterns", metaValue_buddhist_DatePatterns },
            { "java.time.japanese.Eras", metaValue_java_time_japanese_Eras },
            { "roc.MonthNames", metaValue_MonthNames },
            { "buddhist.Eras", metaValue_java_time_buddhist_long_Eras },
            { "laoo.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u00a4\u00a0#,##0.00",
                    "#,##0%",
                    "",
                }
            },
            { "field.week", "\u0ead\u0eb2\u0e97\u0eb4\u0e94" },
            { "buddhist.QuarterNames", metaValue_QuarterNames },
            { "buddhist.MonthNarrows", metaValue_buddhist_MonthNarrows },
            { "islamic.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "roc.DayNarrows", metaValue_DayNarrows },
            { "roc.AmPmMarkers", metaValue_AmPmMarkers },
            { "java.time.roc.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{other:0\u00a0\u0e9e\u0eb1\u0e99}",
                    "{other:00\u00a0\u0e9e\u0eb1\u0e99}",
                    "{other:000\u00a0\u0e81\u0eb5\u0e9a}",
                    "{other:0\u00a0\u0ea5\u0ec9\u0eb2\u0e99}",
                    "{other:00\u00a0\u0ea5\u0ec9\u0eb2\u0e99}",
                    "{other:000\u00a0\u0ea5\u0ec9\u0eb2\u0e99}",
                    "{other:0\u00a0\u0e95\u0eb7\u0ec9}",
                    "{other:00\u00a0\u0e95\u0eb7\u0ec9}",
                    "{other:000\u00a0\u0e95\u0eb7\u0ec9}",
                    "{other:0\u00a0\u0ea5\u0ec9\u0eb2\u0e99\u0ea5\u0ec9\u0eb2\u0e99}",
                    "{other:00\u0ea5\u0ea5}",
                    "{other:000\u0ea5\u0ea5}",
                }
            },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "java.time.buddhist.narrow.Eras", metaValue_java_time_buddhist_long_Eras },
            { "timezone.regionFormat.daylight", "\u0ec0\u0ea7\u0ea5\u0eb2\u0e81\u0eb2\u0e87\u0ec0\u0ea7\u0eb1\u0e99 {0}" },
            { "DatePatterns",
                new String[] {
                    "EEEE \u0e97\u0eb5 d MMMM G y",
                    "d MMMM y",
                    "d MMM y",
                    "d/M/y",
                }
            },
            { "buddhist.DayAbbreviations", metaValue_DayAbbreviations },
            { "islamic.TimePatterns", metaValue_TimePatterns },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "standalone.DayNames", metaValue_DayNames },
            { "field.hour", "\u0e8a\u0ebb\u0ec8\u0ea7\u0ec2\u0ea1\u0e87" },
            { "islamic.MonthAbbreviations",
                new String[] {
                    "\u0ea1\u0eb8\u0eae\u0eb1\u0e94",
                    "\u0ec0\u0e84\u0eb2\u0eb0",
                    "\u0eae\u0ead\u0e94\u0e9a\u0eb5 1",
                    "\u0eae\u0ead\u0e81\u0e9a\u0eb5 2",
                    "\u0e99\u0eb8\u0ea1\u0eb2 1",
                    "\u0e99\u0eb8\u0ea1\u0eb2 2",
                    "\u0ec0\u0eae\u0eb2\u0eb0",
                    "\u0e8a\u0eb0\u0ead\u0ecc",
                    "\u0ec0\u0eae\u0eb2\u0eb0\u0ea1\u0eb0",
                    "\u0ec0\u0e8a\u0ebb\u0eb2",
                    "\u0e8a\u0eb8\u0ea5\u0e81\u0eb4\u0ead\u0eb8",
                    "\u0e8a\u0eb8\u0ea5\u0eab\u0eb4\u0e88",
                    "",
                }
            },
            { "islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "calendarname.buddhist", "\u0e9b\u0eb0\u0e95\u0eb4\u0e97\u0eb4\u0e99 \u0e9e\u0eb8\u0e94\u0e97\u0eb0\u0eaa\u0eb1\u0e87\u0e81\u0eb2\u0e94" },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u00a4#,##0.00;\u00a4-#,##0.00",
                    "#,##0%",
                    "\u00a4#,##0.00;\u00a4-#,##0.00",
                }
            },
            { "buddhist.DayNarrows", metaValue_DayNarrows },
            { "java.time.islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "japanese.DayNarrows", metaValue_DayNarrows },
            { "QuarterNames", metaValue_QuarterNames },
            { "roc.TimePatterns", metaValue_TimePatterns },
            { "QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "japanese.Eras", metaValue_java_time_japanese_Eras },
            { "roc.abbreviated.AmPmMarkers", metaValue_abbreviated_AmPmMarkers },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
        };
        return data;
    }
}
