
// line 1 "PathQuery.ragel"
// Generated using:
// ragel -J -o src/com/appspot/btcticker/fsm/PathQuery.java PathQuery.ragel
//
package com.appspot.btcticker.fsm;

import com.appspot.btcticker.enums.Currency;

public class PathQuery {

	public Currency from = Currency.BITCOIN;
	public Currency to   = Currency.DOLLAR;
	public double amount = -9;


// line 18 "src/com/appspot/btcticker/fsm/PathQuery.java"
private static byte[] init__query_actions_0()
{
	return new byte [] {
	    0,    1,    1,    1,    2,    1,    3,    1,    4,    1,    5,    1,
	    9,    2,    0,    1,    2,    9,    6,    2,    9,    7,    2,    9,
	    8
	};
}

private static final byte _query_actions[] = init__query_actions_0();


private static byte[] init__query_key_offsets_0()
{
	return new byte [] {
	    0,    0,    1,    3,    6,    7,    8,    9,   10,   11,   14,   15,
	   16,   17,   18,   19,   20,   21,   22,   23,   24,   25,   26,   27,
	   28,   29,   36,   43,   43,   45,   46
	};
}

private static final byte _query_key_offsets[] = init__query_key_offsets_0();


private static char[] init__query_trans_keys_0()
{
	return new char [] {
	   47,   48,   57,  112,   48,   57,  112,  110,  103,  116,   99,  101,
	  103,  117,  117,  114,   98,  112,  115,  100,  117,  114,   98,  116,
	   99,   98,  112,  115,  100,   46,   98,  101,  103,  117,   48,   57,
	   46,   98,  101,  103,  117,   48,   57,   46,   50,   46,   46,   50,
	    0
	};
}

private static final char _query_trans_keys[] = init__query_trans_keys_0();


private static byte[] init__query_single_lengths_0()
{
	return new byte [] {
	    0,    1,    0,    1,    1,    1,    1,    1,    1,    3,    1,    1,
	    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,
	    1,    5,    5,    0,    2,    1,    2
	};
}

private static final byte _query_single_lengths[] = init__query_single_lengths_0();


private static byte[] init__query_range_lengths_0()
{
	return new byte [] {
	    0,    0,    1,    1,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    1,    1,    0,    0,    0,    0
	};
}

private static final byte _query_range_lengths[] = init__query_range_lengths_0();


private static byte[] init__query_index_offsets_0()
{
	return new byte [] {
	    0,    0,    2,    4,    7,    9,   11,   13,   15,   17,   21,   23,
	   25,   27,   29,   31,   33,   35,   37,   39,   41,   43,   45,   47,
	   49,   51,   58,   65,   66,   69,   71
	};
}

private static final byte _query_index_offsets[] = init__query_index_offsets_0();


private static byte[] init__query_indicies_0()
{
	return new byte [] {
	    0,    1,    2,    1,    4,    3,    1,    4,    1,    5,    1,    6,
	    1,    7,    1,    8,    1,    9,   10,   11,    1,   12,    1,   13,
	    1,   14,    1,   13,    1,   15,    1,   13,    1,   16,    1,   17,
	    1,   18,    1,   19,    1,   13,    1,   20,    1,   17,    1,   21,
	    1,   17,    1,   22,   24,   25,   26,   27,   23,    1,   28,   24,
	   25,   26,   27,    3,    1,    1,   29,   30,    1,   29,    1,   29,
	   31,    1,    0
	};
}

private static final byte _query_indicies[] = init__query_indicies_0();


private static byte[] init__query_trans_targs_0()
{
	return new byte [] {
	    2,    0,   25,   26,    5,    6,   27,    8,   28,   10,   12,   14,
	   11,   29,   13,   15,   17,   30,   19,   20,   22,   24,    3,   25,
	    7,   16,   21,   23,    4,    4,    9,   18
	};
}

private static final byte _query_trans_targs[] = init__query_trans_targs_0();


private static byte[] init__query_trans_actions_0()
{
	return new byte [] {
	    0,    0,   13,    3,    0,    0,    0,    0,    0,    7,    9,    5,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,   11,    1,
	   11,   19,   22,   16,   11,    0,    0,    0
	};
}

private static final byte _query_trans_actions[] = init__query_trans_actions_0();


private static byte[] init__query_eof_actions_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,   11,   11,    0,    0,    0,    0
	};
}

private static final byte _query_eof_actions[] = init__query_eof_actions_0();


static final int query_start = 1;
static final int query_first_final = 25;
static final int query_error = 0;

static final int query_en_main = 1;


// line 48 "PathQuery.ragel"


	public boolean parse(String urlPart) {
		char[] data = urlPart.toCharArray();
		
		// Used by Ragel
        int cs;
        int p = 0;
        int pe = data.length;
        int eof = data.length;
        
        // Used to store extracted data
        final int zero = (int) '0';
        int i = 0;
        double f = 0.0;
        double scale = 1.0;
		
		// reset state
		from = Currency.BITCOIN;
		to   = Currency.DOLLAR;
		amount = -1;
		
		
// line 176 "src/com/appspot/btcticker/fsm/PathQuery.java"
	{
	cs = query_start;
	}

// line 71 "PathQuery.ragel"
		
// line 183 "src/com/appspot/btcticker/fsm/PathQuery.java"
	{
	int _klen;
	int _trans = 0;
	int _acts;
	int _nacts;
	int _keys;
	int _goto_targ = 0;

	_goto: while (true) {
	switch ( _goto_targ ) {
	case 0:
	if ( p == pe ) {
		_goto_targ = 4;
		continue _goto;
	}
	if ( cs == 0 ) {
		_goto_targ = 5;
		continue _goto;
	}
case 1:
	_match: do {
	_keys = _query_key_offsets[cs];
	_trans = _query_index_offsets[cs];
	_klen = _query_single_lengths[cs];
	if ( _klen > 0 ) {
		int _lower = _keys;
		int _mid;
		int _upper = _keys + _klen - 1;
		while (true) {
			if ( _upper < _lower )
				break;

			_mid = _lower + ((_upper-_lower) >> 1);
			if ( data[p] < _query_trans_keys[_mid] )
				_upper = _mid - 1;
			else if ( data[p] > _query_trans_keys[_mid] )
				_lower = _mid + 1;
			else {
				_trans += (_mid - _keys);
				break _match;
			}
		}
		_keys += _klen;
		_trans += _klen;
	}

	_klen = _query_range_lengths[cs];
	if ( _klen > 0 ) {
		int _lower = _keys;
		int _mid;
		int _upper = _keys + (_klen<<1) - 2;
		while (true) {
			if ( _upper < _lower )
				break;

			_mid = _lower + (((_upper-_lower) >> 1) & ~1);
			if ( data[p] < _query_trans_keys[_mid] )
				_upper = _mid - 2;
			else if ( data[p] > _query_trans_keys[_mid+1] )
				_lower = _mid + 2;
			else {
				_trans += ((_mid - _keys)>>1);
				break _match;
			}
		}
		_trans += _klen;
	}
	} while (false);

	_trans = _query_indicies[_trans];
	cs = _query_trans_targs[_trans];

	if ( _query_trans_actions[_trans] != 0 ) {
		_acts = _query_trans_actions[_trans];
		_nacts = (int) _query_actions[_acts++];
		while ( _nacts-- > 0 )
	{
			switch ( _query_actions[_acts++] )
			{
	case 0:
// line 18 "PathQuery.ragel"
	{ i = 0; f = 0.0; scale = 1.0; }
	break;
	case 1:
// line 19 "PathQuery.ragel"
	{ i = i * 10 + (int)data[p] - zero; }
	break;
	case 2:
// line 20 "PathQuery.ragel"
	{ scale = scale * 0.1; f = f + scale * ((int)data[p] - zero); }
	break;
	case 3:
// line 27 "PathQuery.ragel"
	{ }
	break;
	case 4:
// line 28 "PathQuery.ragel"
	{ to = Currency.EURO; }
	break;
	case 5:
// line 29 "PathQuery.ragel"
	{ to = Currency.POUND; }
	break;
	case 6:
// line 34 "PathQuery.ragel"
	{ from = Currency.DOLLAR; to = Currency.BITCOIN; }
	break;
	case 7:
// line 37 "PathQuery.ragel"
	{ from = Currency.EURO; to = Currency.BITCOIN; }
	break;
	case 8:
// line 40 "PathQuery.ragel"
	{ from = Currency.POUND; to = Currency.BITCOIN; }
	break;
	case 9:
// line 44 "PathQuery.ragel"
	{ amount = i + f; }
	break;
// line 303 "src/com/appspot/btcticker/fsm/PathQuery.java"
			}
		}
	}

case 2:
	if ( cs == 0 ) {
		_goto_targ = 5;
		continue _goto;
	}
	if ( ++p != pe ) {
		_goto_targ = 1;
		continue _goto;
	}
case 4:
	if ( p == eof )
	{
	int __acts = _query_eof_actions[cs];
	int __nacts = (int) _query_actions[__acts++];
	while ( __nacts-- > 0 ) {
		switch ( _query_actions[__acts++] ) {
	case 9:
// line 44 "PathQuery.ragel"
	{ amount = i + f; }
	break;
// line 328 "src/com/appspot/btcticker/fsm/PathQuery.java"
		}
	}
	}

case 5:
	}
	break; }
	}

// line 72 "PathQuery.ragel"
		
		if (cs < query_first_final) {
			return false;
		}
		
		return true;
	}
}